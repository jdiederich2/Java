package challenge4.shapes3d;


public class Cone extends Shape3D {
	
	public double radius, height;
	
	public Cone(double radius, double height) {
		super("Cone");
		this.radius = radius;
		this.height = height;
	}


	@Override
	public double getSurfaceArea() {
		double SA;
		SA = PI * radius * (radius + Math.sqrt((height * height) + (radius * radius)));
		return SA;
	}


	@Override
	public double getVolume() {
		double V;
		V = PI * (radius*radius) * (height/3);
		return V;
	}
	
	
	@Override
	public String getShapeSpecificToStringParameters() {
		return radius + " inch radius | " + height + " inches tall";
	}
	
}
