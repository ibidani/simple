package simpleapp.sessionbeans;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

class LoggerBeanTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLog() {
		//not much of a test!
		new LoggerBean().log(0, 'hello')
	}

}
