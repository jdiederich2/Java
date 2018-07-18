/**
 * 
 */
package edu.cvtc.web.model;

import java.io.Serializable;

/**
 * @author JDiederich2
 *
 */
public class Person implements Serializable {

	private static final long serialVersionUID = -1876843386646951589L;
	
	private String firstName;
	private String lastName;
	private Integer age;					// Integer used instead of int to use the compare to method.
	private String favoriteColor;
		
	public Person() {
		/* no-arg for JavaBean implementation */
	}
		
	public Person(String firstName, String lastName, Integer age, String favoriteColor) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.favoriteColor = favoriteColor;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getFavoriteColor() {
		return favoriteColor;
	}
	public void setFavoriteColor(String favoriteColor) {
		this.favoriteColor = favoriteColor;
	}
	
}
