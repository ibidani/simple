package simpleapp.mdbs

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import javax.ejb.EJB;
import simpleapp.sessionbeans.Logger;

@MessageDriven(activationConfig = [
	@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
	@ActivationConfigProperty(propertyName = "destination", propertyValue = "jms/q0")],
	mappedName = "jms/q0")
public class GroovyMdb implements MessageListener {
	@EJB
	private Logger logger;
	
	public GroovyMdb() {}
	
	public void onMessage(Message message) {
		if (message instanceof TextMessage) {
			def msg = ((TextMessage)message).text
			println "$this received TextMessage: $msg"
			logger.log(3, msg)
		}
	}
}
