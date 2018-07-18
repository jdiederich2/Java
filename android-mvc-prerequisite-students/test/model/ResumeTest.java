package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;

public class ResumeTest {

	private Resume resume;
	
	@Before
	public void setUp() throws Exception {
		this.resume = new Resume("Benjamin J. Anderson", "PhD.c");
	}

	@Test
	public void testCanGetEducation() {
		assertThat(this.resume.getEducation(), is("PhD.c"));
	}

	@Test
	public void testCanGetName() {
		assertThat(this.resume.getName(), is("Benjamin J. Anderson"));
	}

	@Test
	public void testToString() {
		assertThat(this.resume.toString(),
				is("Name: Benjamin J. Anderson Education: PhD.c"));
	}
}
