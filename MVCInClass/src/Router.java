
public class Router {

	private String activity;
	private String action;
	private Intent intent;
	
	public Router(String activity, String action) {
		this.activity = activity;
		this.action = action;
	}
	
	public Router(String activity, String action, Intent intent) {
		this.activity = activity;
		this.action = action;
		this.intent = intent;
	}
	
	public Activity getActivity() {
		return new Activity(this.activity, this.action, this.intent);
	}
}
