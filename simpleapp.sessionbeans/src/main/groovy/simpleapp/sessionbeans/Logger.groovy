package simpleapp.sessionbeans;

import javax.ejb.Local;

@Local
public interface Logger {
	void log(int level, String msg);
}
