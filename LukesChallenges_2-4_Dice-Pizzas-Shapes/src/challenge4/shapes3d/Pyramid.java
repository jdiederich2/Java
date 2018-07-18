package challenge4.shapes3d;


public class Pyramid extends Shape3D {

	public double baseLength, height;
	
	
	public Pyramid(double baseLength, double height) {
		super("Pyramid");
		this.baseLength = baseLength;
		this.height = height;
	}


	@Override
	public double getSurfaceArea() {
		double SA;
		SA = (baseLength*baseLength) + (2*baseLength) * Math.sqrt((Math.pow(baseLength, 2)/4) + (height*height));
		return SA;
	}


	@Override
	public double getVolume() {
		double V;
		V =  (baseLength*baseLength) * (height/3);
		return V;
	}
	

	@Override
	public String getShapeSpecificToStringParameters() {
		return baseLength + " inch base-side | " + height + " inches tall";
	}
	
}
