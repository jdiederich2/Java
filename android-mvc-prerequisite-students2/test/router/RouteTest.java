package router;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Before;
import org.junit.Test;

public class RouteTest {

	private Route route;

	@Before
	public void setUp() throws Exception {
		this.route = RouteParser.load(Dispatcher.ROUTES_FILE).getRoute("/");
	}

	@Test
	public void testGetControllerReturnsTheAssociatedControllerName() {
		assertThat(this.route.getController(), is("Home"));
	}

	@Test
	public void testGetControllerReturnsTheAssociatedActionName() {
		assertThat(this.route.getAction(), is("Index"));
	}
}
