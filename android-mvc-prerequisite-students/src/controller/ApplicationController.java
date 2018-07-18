package controller;

public abstract class ApplicationController {

	protected java.lang.reflect.Method activity;
	protected String action;

	// TODO
	//		not yet implemented	
	public ApplicationController(String action) {

	}

	// TODO
	//		not yet implemented
	public String getAction() {
		return null;
	}
	
	public Responder<?> execute() throws Exception {
		return (Responder<?>) this.getClass().getMethod(this.action).invoke(this);
	}
	
}
