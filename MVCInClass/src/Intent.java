
public class Intent {

	private String data;
	private String activity;
	private String originalActivity;
	
	public Intent(String originalActivity, String activity) {
		this.activity = activity;
		this.originalActivity = originalActivity;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public String getData() {
		return this.data;
	}
	
	
}
