package simpleapp.sessionbeans

import javax.ejb.Stateless;

@Stateless(mappedName = 'ejb/LoggerService')
class LoggerBean implements Logger {

	@Override
	public void log(int level, String msg) {
		println "$this log: [$level] $msg"
	}
}
