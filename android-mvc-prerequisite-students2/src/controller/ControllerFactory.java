package controller;

import java.lang.reflect.Constructor;

//
// This is beyond the scope of this class
// do not make any changes to this file
//
public class ControllerFactory {

	public static final String CONTROLLER_NAMESPACE = "controller";
	public static final String CONTROLLER_POSTFIX = "Controller";
	
	public static ApplicationController create(String controller, String action) throws Exception {
		Class<?> klass = Class.forName(CONTROLLER_NAMESPACE + "." + controller + CONTROLLER_POSTFIX);
		Constructor<?> c = klass.getConstructor(String.class);

		return (ApplicationController) c.newInstance(action);
	}
	
}
