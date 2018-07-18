package controller;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;

public class HomeControllerTest {

	@Test
	public void testIndex() {
		HomeController c = new HomeController("Index");
		assertThat(c.Index().getResponse(), is("Hello World!"));
	}

	@Test
	public void testAbout() {
		HomeController c = new HomeController("About");
		assertThat(c.About().getResponse(), is("Android Prerequisite Assessment"));
	}
}
