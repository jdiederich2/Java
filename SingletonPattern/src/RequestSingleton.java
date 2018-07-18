
public class RequestSingleton {

	public static String name;
	
	private RequestSingleton() {
		// Constructor
	}
	
	public static String getInstance() {
		if (null == name ) {
			System.out.println("Setting instance");
			name = "Jen";
		}
		return name;
	}
	
}
