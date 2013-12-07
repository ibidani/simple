package simpleapp.sessionbeans

import javax.ejb.Stateless;

@Stateless(mappedName = 'ejb/PublisherService')
class GroovyPublisherBean implements GroovyPublisher {

	@Override
	public String publish(String msg) {
		// TODO Auto-generated method stub
		return msg;
	}
}
