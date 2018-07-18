package challenge4.shapes2d;


public class Square extends Rectangle {
	

	
	public Square(double width) {
		super(width, width);
		this.width = width;
		shapeType = "squre";
	}
	
	
	@Override 
	public String getShapeSpecificToStringParameters() {
		return width + " inch side-lengths";
	}

	
}
