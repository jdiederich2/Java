package challenge4.shapes2d;


public class Triangle extends Shape2D {
	
	public double base, left, right, height;
	

	public Triangle(double base, double left, double right, double height) {
		super("Triangle");
		this.base = base;
		this.left = left;
		this.right = right;
		this.height = height;
	}
	
	
	@Override
	public double getArea() {

		return 0.5 * base * height;
	}
	
	
	@Override
	public double getPerimeter() {
		return base + left + right;
	}
	
	
	@Override
	public String getShapeSpecificToStringParameters() {

		return base + " inches wide | " + left + " inches tall | " + right + " inches tall | " + height + " inches tall" ;
	}
	
}
