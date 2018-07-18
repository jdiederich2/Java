package people;

public class People {
	

	EyeColor eyeColor;
	
	public People(EyeColor eyeColor) {
		this.eyeColor = eyeColor;
	}
	
	
	public static enum EyeColor {
		BLUE, BROWN, GREEN, HAZEL
	}
	
	public EyeColor getEyeColor() {
		return eyeColor;
	}
	
	

}
