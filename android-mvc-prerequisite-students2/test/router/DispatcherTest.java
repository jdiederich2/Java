package router;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Before;
import org.junit.Test;

import controller.Responder;

public class DispatcherTest {

	private Dispatcher dispatcher;
	
	@Before
	public void setUp() throws Exception {
		this.dispatcher = new Dispatcher("/");
	}

	@Test
	public void testDispatchExecutesControllerAction() throws Exception {
		Responder<?> v = this.dispatcher.dispatch();
		assertThat(v.getResponse(), is("Hello World!"));
	}

}
