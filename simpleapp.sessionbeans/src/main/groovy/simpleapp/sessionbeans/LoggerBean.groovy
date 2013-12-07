package simpleapp.sessionbeans

import javax.ejb.Local;
import javax.ejb.Stateless;

@Stateless
@Local(value = Logger)
class LoggerBean implements Logger {
	
	@Override
	public void log(int level, String msg) {
		println "$this log: [$level] $msg"
	}
}
