package challenge4.shapes3d;


public abstract class Shape3D {
	
	public String shapeType;
	
	public final double PI = 3.14159;
	
	public Shape3D(String shapeType) {
		this.shapeType = shapeType;
	}
	
	public abstract double getSurfaceArea();
	
	
	public abstract double getVolume();
	
	
	public abstract String getShapeSpecificToStringParameters();
	
	
	public String toString() {
		return shapeType + "\nSurfaceArea = " + getSurfaceArea() + " square inches\nVolume = " + getVolume() + " inches cubed\n[" + getShapeSpecificToStringParameters() + "]";
	}
	
}
