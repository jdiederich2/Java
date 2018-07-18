
public class Activity {
	
	private Intent intent;
	private String activityName;
	private String action;

	public Activity(String activityName, String action, Intent intent) {
		this.activityName = activityName;
		this.action = action;
		this.intent = intent;
	}
	
	public Intent run() throws Exception {
		return (Intent)
				this.getClass()
				.getMethod(this.action)
				.invoke(this);
	}
	
	public String toString() {
		return "ActivityName: " + this.activityName + 
				" Action: " + this.action;
	}
	
	public void onCreate(Intent data) {
		if (null != intent ) {
			View.render(this.intent.getData());
		}
	}
	
	public Intent sendUserName() {
		// Intent(current object, the next activity to run)
		Intent intent = new Intent(this.activityName, "HelloActivity");
		intent.setData("Hello World!");
		// startActivity(intent)
		// creates a new Activity Object
		// runs the default method onCreate()
		return intent;
	}
}
