
public class Main {

	public static void main(String[] args) throws Exception {
		// Assumes MainView has loaded 
		// and user clicks the button
		Router route = new Router("Main", "sendUserName");
		
		// See what activity we are currently in.
		System.out.println(
				route.getActivity().toString()
		);
		
		Intent intent = route.getActivity().run();
		
		// simulate sendActivity
		Activity activity = new Activity(  // Activity is Greeter, action is onCreate, sending intent
				"Greeter", "onCreate", intent
		);
		
		// See the new activity that's going to run
		System.out.println(activity.toString());
	}

}
