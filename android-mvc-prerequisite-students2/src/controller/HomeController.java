package controller;

public class HomeController extends ApplicationController {
	

	public HomeController(String action) {
		super(action);
	}

	public Responder<String> Index() {
		return new Responder<String>("Hello World!");
	}
	

	public Responder<String> About() {
		return new Responder<String>("Android Prerequisite Assessment");
	}

	

	
}
