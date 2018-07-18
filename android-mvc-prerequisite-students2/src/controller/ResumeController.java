package controller;

import java.util.Scanner;

// TODO
//		not yet implemented	
public class ResumeController {
	
	protected String name;
	protected String education;

	public ResumeController(String name) {
		this.name = name;
	}
	

	public Responder<String> BillyJoel() {
		getName();
		return new Responder<String>("Billy Joel");
		
	}

	public Responder<String> BAnderson() {
		return new Responder<String>("Benjamin J. Anderson");
	}
	
	public String getName() {
		return name;
	}
	
	public String getEducation() {
		return education;
	}
}
