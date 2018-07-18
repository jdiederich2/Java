package controller;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ResumeControllerTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testBillyJoel() {
		ResumeController c = new ResumeController("BillyJoel");
		assertThat(c.BillyJoel().getResponse().getName(), is("Billy Joel"));
		assertThat(c.BillyJoel().getResponse().getEducation(), is("High School"));
	}

	@Test
	public void testBAnderson() {
		ResumeController c = new ResumeController("BAnderson");
		assertThat(c.BAnderson().getResponse().getName(), is("Benjamin J. Anderson"));
		assertThat(c.BAnderson().getResponse().getEducation(), is("PhD.c"));
	}

}
