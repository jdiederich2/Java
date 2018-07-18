package model;

//
// TODO:
//		view unit tests on implementation
//		test/model/ResumeTest
public class Resume {

	private String name;
	private String education;
	
	public Resume(String name, String education ) {
		this.name = name;
		this.education = education;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEducation() {
		return education;
	}

	public String toString() {
		return("Name: " + name + " Education: " + education);
	}
}
