package challenge4.shapes3d;


public class Cylinder extends Shape3D {
	
	public double radius, height;
	
	public Cylinder(double radius, double height) {
		super("Cylinder");
		this.radius = radius;
		this.height = height;
	}


	@Override
	public double getSurfaceArea() {
		double SA;
		SA = (2 * PI * radius * height) + (2 * PI * (Math.pow(radius, 2)));
		return SA;
	}


	@Override
	public double getVolume() {
		double V;
		V = PI * (Math.pow(radius, 2)) * height;
		return V;
	}
	
	
	@Override
	public String getShapeSpecificToStringParameters() {
		return radius + " inch radius | " + height + " inches tall";
	}
	
}
