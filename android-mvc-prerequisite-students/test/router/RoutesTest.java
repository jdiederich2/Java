package router;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import controller.ApplicationController;
import controller.ControllerFactory;

public class RoutesTest {

	@Test
	public void testCanRouteToBillyJoelsResume() throws Exception {
		Route r = RouteParser.load(Dispatcher.ROUTES_FILE).getRoute("/billyjoel");
		ApplicationController controller = ControllerFactory.create(r.getController(), r.getAction());
		assertThat(controller.getAction(), is("BillyJoel"));
	}

	@Test
	public void testCanRouteToBensResume() throws Exception {
		Route r = RouteParser.load(Dispatcher.ROUTES_FILE).getRoute("/resumes/banderson");
		ApplicationController controller = ControllerFactory.create(r.getController(), r.getAction());
		assertThat(controller.getAction(), is("BAnderson"));
	}
}
