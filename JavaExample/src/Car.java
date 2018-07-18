
public class Car {

	protected boolean hasSeatbelts = true;
	protected String engineType;
	
	public Car() {
		// does nothing;
	}
	
	public Car(boolean hasSeatbelts) {
		this.hasSeatbelts = hasSeatbelts;
	}
	
	
	public boolean hasSeatbelts() {
		return this.hasSeatbelts;
	}	
	
	public String getEngineType() {
		return this.engineType;
	}
	
}
