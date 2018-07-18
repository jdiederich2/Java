package challenge4.shapes3d;


public class Sphere extends Shape3D {
	
	public double radius;

	public Sphere(double radius) {
		super("Sphere");
		this.radius = radius;
	}
	

	@Override
	public double getSurfaceArea() {
		double SA;
		SA = 4 * PI * (radius * radius);
		return SA;
	}


	@Override
	public double getVolume() {
		double V;
		V = (4/3) * PI * Math.pow(radius, 3);
		return V;
	}
	
	
	@Override
	public String getShapeSpecificToStringParameters() {
		
		return radius + " inch radius";
	}

	
	
}
