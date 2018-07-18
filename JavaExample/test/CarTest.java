import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;

import junit.framework.TestCase;

public class CarTest extends TestCase{
	
	private Car car;
	
	@Override
	protected void setUp() {
		this.car = new Car();
	}

	@Test
	public void testDefaultSeatbeltSetting() {
		assertThat(this.car.hasSeatbelts(), is (true));
	}
	
	@Test
	public void testModelAsDontHaveSeatBelts() {
		ModelA modelA = new ModelA(ModelA.FOUR_CYLINDER);
		assertThat(modelA.hasSeatbelts(), is(!true));
	}
	
	@Test
	public void testV8IsFordV8Description() {
		assertThat(ModelA.V8, is("Ford V8"));
	}
	
	@Test
	public void testCanGetEngineType() {
		ModelA modelA = new ModelA(ModelA.V8);
		assertThat(modelA.getEngineType(), is(ModelA.V8));
	}

}
