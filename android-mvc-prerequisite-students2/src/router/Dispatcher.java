package router;

import controller.ApplicationController;
import controller.ControllerFactory;
import controller.Responder;

//
// This file is complete and does not need any additional changes
//
public class Dispatcher {

	public static final String ROUTES_FILE = "config/routes.xml";
	
	private String routePath;
	
	public Dispatcher(String routePath) {
		this.routePath = routePath;
	}

	public Responder<?> dispatch() throws Exception {
		Route route = RouteParser.load(ROUTES_FILE).getRoute(this.routePath);
		ApplicationController controller = ControllerFactory.create(
				route.getController(), route.getAction());
		return controller.execute();
	}
}
