
public class Main {

	public static void main(String[] args) {
		System.out.println(RequestSingleton.getInstance());
		
		System.out.println(RequestSingleton.getInstance());
		
		System.out.println(RequestSingleton.getInstance());

		// You can never use 
		// new RequestSingleton()
		// Will => error
	}

}
