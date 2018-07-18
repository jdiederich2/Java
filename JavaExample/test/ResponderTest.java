import static org.junit.Assert.*;

import org.junit.Before;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;

public class ResponderTest {

	@Before
	public void setUp() throws Exception {
	}
	
	
	@Test
	public void testCanRespondWithString() {
		Responder<String> response = new Responder<String>("Hello World");
		assertThat(response.getValue(), is("Hello World"));
	}
	
	
	@Test
	public void testCanRespondWithACar() {
		ModelA modelA = new ModelA(ModelA.FOUR_CYLINDER);
		Responder<Car> response = new Responder<Car>(modelA);
		assertThat(response.getValue().getEngineType(), is(ModelA.FOUR_CYLINDER));
	}

}
