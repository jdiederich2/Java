package challenge4.shapes2d;


public class Circle extends Oval {

	public double radius;
	
	public Circle(double radius) {
		super(radius, radius);
		
		this.radius = radius;
		shapeType = "Circle";
	}
	
	@Override
	public double getPerimeter() {
		double P;
		P = 2 * 3.14159 * radius;
		return P;
	}
	

	@Override
	public String getShapeSpecificToStringParameters() {
		return radius + " inch radius";
	}
	
}
