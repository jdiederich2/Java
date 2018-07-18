# Android Prerequisite Assessment

This repository contains an assessment pertaining to MVC, plain old java objects (POJO's), basic XML, and basic object-oriented programming concepts.

Please review the Syllabus in regards to any concerns with this assessment.

## Overview
Use the following as a guide for this assessment.

### Getting Set Up

Download this assessment by clicking the "Clone or download" link in the right-hand corner. Click "Download ZIP." Extract the ZIP directory and import the existing project into Eclipse.

### Running the Unit Tests

In Eclipse, right-click on the `test` directory, navigate to `Run As`, and click `JUnit Test`. You can then navigate all the passing and failing unit tests.

### Interpreting the Unit Tests
Unit tests describe the functionality required by the various objects in this small MVC framework. For Example:

```Java
	@Test
	public void testAbout() {
		HomeController c = new HomeController("About");
		assertThat(c.About().getResponse(), is("Android Prerequisite Assessment"));
	}
```

States that there's an `About` method in the object `HomeController`. It returns an object that defines a `getResponse()` method that returns the String `"Android Prerequisite Assessment"`.

A helpful pointer when reviewing tests is that you may see:

`@Test(expected = Exception.class)`

This means that it will throw an error.

### Comments

Throughout the project you will see comments such as:

```
	// TODO
	//		not yet implemented
```

stating that you need to implement logic. There's a few other comments to help guide you. If you see comments stating `this file is complete` or `requires no additional changes` do not edit them.

### Unit Tests

You are not allowed to make any changes any *existing* unit tests. You are required to add one unit test pertaining to your resume.

### Routes

Routes are configured through an XML file in `config/routes.xml`. You will need to edit this file to make various unit tests pass.

## Instructions

This project follows the MVC pattern like Android. You are required to implement the missing functionality to make the corrosponding unit tests pass.

Note: replace `YourNameHere` with your real name. For example: `/resume/BenAnderson`.

You are also required to create a route `/resume/YouNameHere` that points to the `ResumeController` and `YourNameHere` action. This action needs to return a resume similar to the example ones described in the `ResumeControllerTest` and `ResumeTest` You are required to add a supporting unit test in `ResumeControllerTest` pertaining to the result of the `YourNameHere` action. 

## How you will be Graded

You will be graded on the amount of unit tests you have passing. Points may be deducted for severe inconsistencies and inefficiencies identified in your codebase. For example:

```Java
	String unused = "I'm not being used";
	return "I'm being used";
```

You will also be assessed on your MVC and Object Oriented Programming skills. You need to proove to your instructor that you understand what you're doing. Clean code, minor inefficiencies, inconsistencies, and utilizing code already existing in the Java SDK / this project is a great way to demonstrate an understanding. Comments explaining your implementation / process is also helpful.




