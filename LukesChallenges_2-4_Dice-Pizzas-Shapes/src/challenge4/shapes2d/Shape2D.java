package challenge4.shapes2d;


// To define a Class as abstract, one only needs to put the Abstract keyword in-between public and
// class in the Class definition.
public abstract class Shape2D {
	/*
	 * An introduction to Abstract Classes. I'm not sure how much you know about them, so I'll give
	 * you a run-down about them.
	 * 
	 * An Abstract Class is a special type of Class that's used as a kind of blueprint for other
	 * classes. They're similar to interfaces (If you've ever used them. If you haven't ever used an
	 * interface, let me know and I'll work them into the next lesson/challenge)
	 * 
	 * The main difference between an Abstract Class and an Interface is that Interfaces can only
	 * define method names for the classes that inherit them, while Abstract Classes are able to
	 * have code of their own, in addition to the ability to define method names for their children.
	 * 
	 * Did everything I just said confuse you? If not, that's great! But I honestly kind of expect
	 * it to be a little confusing, so don't be discouraged if you're confused. I'll explain better
	 * with examples below.
	 * 
	 * One more basic property about Abstract Classes, though: Abstract Classes can NEVER be
	 * instantiated. That means that you can never call "new Shape2D". Instead, you'll have to
	 * create a child class of it and create a new instance of that. But the beauty of that is that
	 * any child of an Abstract Class can also be considered a member of the Abstract Class itself.
	 * For instance, If I created a new Rectangle (which is a child of Shape2D), I could put it in
	 * an array of type Rectangle (as you would expect), but I could ALSO put it in an array of type
	 * Shape2D! (Yes, you can create objects with the type of an Abstract Class, you just can't
	 * instantiate it).
	 * 
	 * More simply put, These lines below are correct and will work:
	 * 
	 * " Shape2D shape = new Rectangle(10, 10); "
	 * 
	 * or
	 * 
	 * " Rectangle r = new Rectangle(20, 20);
	 * 
	 * Shape2D[] shapes = new Shape2D[2];
	 * 
	 * shapes[0] = r;
	 * 
	 * shapes[1] = new Rectangle(30, 10); "
	 * 
	 * 
	 * 
	 * And these lines below are wrong and WILL NOT work:
	 * 
	 * " Shape2D shape = new Shape2D("Rectangle"); "
	 * 
	 * or
	 * 
	 * " Shape2D[] shapes = new Shape2D[1]; // <-- Correct
	 * 
	 * shapes[0] = new Shape2D("Square"); " // <-- Incorrect
	 * 
	 * 
	 * 
	 * 
	 * This is useful because it allows us to treat a bunch of different objects as the same type of
	 * object for simplistic purposes (Such as printing out basic information about them).
	 * 
	 */
	
	
	// The "protected" modifier works like the "private" modifier, except that all children of the
	// class have access to the variable too. This allows us to keep the variable private to outside
	// sources while still allowing easy access to sub-classes (children)
	protected String shapeType;
	
	
	// Even though Shape2D can never be directly instantiated, it still has a constructor. This gets
	// called in the sub-class's constructor by using the term "super();". In this case, we're
	// asking for the child to pass in its shapeType when it calls super, so the call would look
	// like this: "super("exampleShapeType");"
	public Shape2D(String shapeType) {
		this.shapeType = shapeType;
	}
	
	
	// Below is an "abstract method". These are the lines of code that define the functions you want
	// any child of this class to be forced to implement. Whenever a child would extend this class,
	// they'd be forced to create an implementation of this method. Because of this fact, we know
	// FOR SURE that any child of Shape2D WILL HAVE a getArea method. And therefore we don't need to
	// specify a type of object to call it. I.e. these two lines of code are valid:
	/////// Shape2D shape = new Rectangle(10, 20);
	/////// System.out.println(shape.getArea());
	//
	// Just like any other method, you can define:
	// - The scope: (public, private, or protected)
	// - The return type: (int, double, Object, etc.)
	// - The name: (getArea, getPerimeter, etc.)
	// - The parameters: (double number, int index, etc.)
	
	/**
	 * This method returns the area of the 2D Shape.
	 */
	public abstract double getArea();
	
	
	/**
	 * This method returns the perimeter of the 2D Shape.
	 */
	public abstract double getPerimeter();
	
	
	/**
	 * This method is supposed to return any shape specific values that the Shape2D class might not
	 * know about. An example of this would be: the length and width values of a rectangle or the
	 * radius of a circle. This method is used in the toString() method.
	 */
	public abstract String getShapeSpecificToStringParameters();
	
	
	// This is where abstract classes shine... Below is a normal method. It's not abstract. That
	// means that the sub-classes don't have to override it. Its code stays the same for all of them
	// unless they specifically CHOOSE to override it (typically you won't do this). Having this
	// ability means that you don't have to write the same code a million times. Can you imagine if
	// I made you write this exact same toString() method in every class? That would be crazy.
	// That's why Abstract Classes are awesome.
	//
	// Fun fact, all classes that don't extend other classes (i.e. any class that isn't a child
	// class) is actually a child of the "Object" Class. This is how java handles Object-Oriented
	// programming, and the toString() method is actually a method of the Object class! See that
	// little green arrow next to the method definition? That means the method is being overridden!
	// You don't have to write "@Override" though, because Java doesn't flag overrides on the basic
	// Object type.
	
	/**
	 * This method returns the Name of the shape, it's area, it's perimeter, and any shape specific
	 * parameters in a string, formatted for the console.
	 */
	public String toString() {
		return shapeType + "\nArea = " + getArea() + " square inches\nPerimeter = " + getPerimeter() + " inches\n[" + getShapeSpecificToStringParameters() + "]";
	}
	
}
