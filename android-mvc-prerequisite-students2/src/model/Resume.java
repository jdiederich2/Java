package model;

//
// TODO:
//		view unit tests on implementation
//		test/model/ResumeTest
public class Resume {

	
	private String name;
	private String education;
	private String response;

	public Resume(String name, String education) {
		this.name = name;
		this.education = education;
	}
	
	public String getName(String name) {
		return name;
	}
	
	public String getEducation() {
		return education;
	}

	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getResponse() {
		return response;
	}
}
