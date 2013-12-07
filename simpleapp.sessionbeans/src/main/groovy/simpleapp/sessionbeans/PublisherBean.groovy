package simpleapp.sessionbeans

import javax.ejb.Stateless;
import javax.ejb.Local;

@Stateless
@Local(value = Publisher)
class PublisherBean implements Publisher {

	@Override
	public String publish(String msg) {
		return "$this received: msg";
	}
}
