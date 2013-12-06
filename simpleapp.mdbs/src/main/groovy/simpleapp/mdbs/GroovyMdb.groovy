package simpleapp.mdbs

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@MessageDriven(activationConfig = [
	@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
	@ActivationConfigProperty(propertyName = "destination", propertyValue = "jms/q0")],
	mappedName = "jms/q0")
public class GroovyMdb implements MessageListener {
	public GroovyMdb() {}
	
	public void onMessage(Message message) {
		if (message instanceof TextMessage) {
			println "$this received TextMessage: ${((TextMessage)message).text}"
		}
	}
}
