package controller;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Before;
import org.junit.Test;

import router.Dispatcher;
import router.Route;
import router.RouteParser;

public class ControllerFactoryTest {

	private Route route;
	
	@Before
	public void setUp() throws Exception {
		this.route = RouteParser.load(Dispatcher.ROUTES_FILE).getRoute("/");
	}

	@Test
	public void testItCreatesTheSpecifiedController() throws Exception {
		String klass = ControllerFactory.create(this.route.getController(), this.route.getAction()).getClass().getName();
		String expected = ControllerFactory.CONTROLLER_NAMESPACE + "." + 
							this.route.getController() + ControllerFactory.CONTROLLER_POSTFIX;
		assertThat(klass, is(expected));
	}

	@Test
	public void testTheControllerWillRunTheProperAction() throws Exception {
		ApplicationController controller = ControllerFactory.create(this.route.getController(), this.route.getAction());
		assertThat(controller.getAction(), is("Index"));
	}
	
	@Test(expected = Exception.class)
	public void testInvalidControllersThrowAnException() throws Exception {
		ControllerFactory.create("invalid", "broken");
	}
}
