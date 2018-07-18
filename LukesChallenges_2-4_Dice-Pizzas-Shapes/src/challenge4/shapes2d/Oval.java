package challenge4.shapes2d;


public class Oval extends Shape2D {

	public double radius1, radius2;
	

	public Oval(double radius1, double radius2) {
		super("Oval");
		this.radius1 = radius1;
		this.radius2 = radius2;
	}
	
	
	@Override
	public double getArea() {
		double A;
		A = radius1 * radius2 * 3.14159;
		return A;
	}
	
	
	@Override
	public double getPerimeter() {
		final double P;
		P = 2.0 * 3.14159 * ( Math.sqrt( ( (radius1*radius1)+(radius2*radius2) ) / 2.0) );
		return P;
	}
	
	
	@Override
	public String getShapeSpecificToStringParameters() {
		return radius1 + " inches tall | " + radius2 + " inches wide";
	}
	
}
