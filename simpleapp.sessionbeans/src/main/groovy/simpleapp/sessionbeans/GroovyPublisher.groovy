package simpleapp.sessionbeans;

import javax.ejb.Local;

@Local
public interface GroovyPublisher {
	String publish(String msg);
}
