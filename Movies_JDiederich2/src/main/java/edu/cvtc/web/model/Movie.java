/**
 * 
 */
package edu.cvtc.web.model;

import java.io.Serializable;

/**
 * @author JDiederich2
 *
 */
public class Movie implements Serializable{

	private static final long serialVersionUID = -833077276058540099L;

	private String title;
	private String director;
	private int lengthInMinutes;
	private String movieDesc;


	public Movie() {
		/* no-arg for JavaBean implementation */
	}
	

	public Movie(String title, String director, int lengthInMinutes, String movieDesc) {
		this.title = title;
		this.director = director;
		this.lengthInMinutes = lengthInMinutes;
		this.movieDesc = movieDesc;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getLengthInMinutes() {
		return lengthInMinutes;
	}

	public void setLengthInMinutes(int lengthInMinutes) {
		this.lengthInMinutes = lengthInMinutes;
	}
	
	public String getMovieDesc() {
		return movieDesc;
	}

	public void setMovieDesc(String movieDesc) {
		this.movieDesc = movieDesc;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
