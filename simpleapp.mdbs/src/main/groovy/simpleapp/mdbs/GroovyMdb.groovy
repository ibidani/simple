package simpleapp.mdbs

import javax.ejb.MessageDriven;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@MessageDriven (mappedName="jms/q0")
class GroovyMdb implements MessageListener {
	public void onMessage(Message message) {
		if (message instanceof TextMessage) {
			println "$this onMessage: ${((TextMessage)message).text}"
		}
	}
}
