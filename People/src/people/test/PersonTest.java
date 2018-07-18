package people.test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;

import junit.framework.TestCase;
import people.People;


public class PersonTest {
	

	@Test
	public void canGetEyeColor() {
		People person = new People(People.EyeColor.HAZEL);
		assertThat(person.getEyeColor(), is(People.EyeColor.HAZEL));
	}

}
