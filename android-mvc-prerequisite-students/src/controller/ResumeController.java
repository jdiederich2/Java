package controller;

import model.Resume;

// TODO
//		not yet implemented	
public class ResumeController {
	

	protected String name;
	protected String education;

	public ResumeController(String name) {
		this.name = name;
	}
	
	
	public Responder<String> BillyJoel() {
		return new Responder<String>("BillyJoel");
	}

	public Responder<String> BAnderson() {
		Resume resume = new Resume("name", "education");
		return new Responder<String>("BAnderson");
	}
	

}
