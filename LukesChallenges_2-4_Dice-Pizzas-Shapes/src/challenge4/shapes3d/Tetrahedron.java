package challenge4.shapes3d;


public class Tetrahedron extends Shape3D {
	
	public double sideLength;
	
	public Tetrahedron(double sideLength) {
		super("Tetrahedron");
		this.sideLength = sideLength;
	}


	@Override
	public double getSurfaceArea() {
		double SA;
		SA = Math.sqrt(3) * Math.pow(sideLength, 2);
		return SA;
	}


	@Override
	public double getVolume() {
		double V;
		V = Math.pow(sideLength, 3)/(6*(Math.sqrt(2)));
		return V;
	}

	
	@Override
	public String getShapeSpecificToStringParameters() {
		return sideLength + " inch sides";
	}
	
}
