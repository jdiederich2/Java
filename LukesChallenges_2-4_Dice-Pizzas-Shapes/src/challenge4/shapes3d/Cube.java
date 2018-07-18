package challenge4.shapes3d;


public class Cube extends RectangularPrism {
	
	public double sideLength;
	
	public Cube(double sideLength) {
		super(sideLength, sideLength, sideLength);
		this.sideLength = sideLength;
		shapeType = "Cube";
	}
	
	
	@Override
	public String getShapeSpecificToStringParameters() {
		return sideLength + " inch side-length";
	}
	
}
