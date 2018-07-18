package challenge4.shapes2d;


public class Rectangle extends Shape2D {
	
	// Variables that are specific to Rectangles.
	public double length, width;
	
	
	// Notice I changed the parameter of "Shape2D" when I made the rectangle. Now, instead of taking
	// in a String shapeType, it instead takes in the length and width of the rectangle.
	public Rectangle(double length, double width) {
		super("Rectangle"); // <-- Here I hard-coded the value "Rectangle" because that's all it'll
							 // ever be.
		
		// Storing the passed in variables as global variables.
		this.length = length;
		this.width = width;
	}
	
	
	// Notice the "@Override"? That means that I'm overriding a method in the parent class. In this
	// case, it means that I'm defining the method, because the method is abstract in the parent
	// class (Shape2D)
	@Override
	public double getArea() {
		return length * width;
	}
	
	
	// Same as before. I'm overriding the abstract method in the parent class and defining it.
	@Override
	public double getPerimeter() {
		return (length * 2) + (width * 2);
	}
	
	
	// Same as before.
	@Override
	public String getShapeSpecificToStringParameters() {
		// Here you can see the format that I want you to write these in. Parameter first, then
		// units, then label. Separated by "|"
		return length + " inches long | " + width + " inches wide";
	}
	
	
}
