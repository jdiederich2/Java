package controller;

public abstract class ApplicationController {

	protected java.lang.reflect.Method activity;
	protected String action;

	// TODO
	//		not yet implemented	
	public ApplicationController(String action) {
		this.action = action;
	}

	// TODO
	//		not yet implemented
	public String getAction() {
		return this.action;
	}
	
	public Responder<?> execute() throws Exception {
		return (Responder<?>) this.getClass().getMethod(this.action).invoke(this);
	}
	
}
