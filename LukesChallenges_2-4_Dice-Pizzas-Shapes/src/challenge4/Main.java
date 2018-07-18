package challenge4;


import challenge4.shapes2d.Circle;
import challenge4.shapes2d.Oval;
import challenge4.shapes2d.Rectangle;
import challenge4.shapes2d.Shape2D;
import challenge4.shapes2d.Square;
import challenge4.shapes2d.Triangle;
import challenge4.shapes3d.Cone;
import challenge4.shapes3d.Cube;
import challenge4.shapes3d.Cylinder;
import challenge4.shapes3d.Pyramid;
import challenge4.shapes3d.RectangularPrism;
import challenge4.shapes3d.Shape3D;
import challenge4.shapes3d.Sphere;
import challenge4.shapes3d.Tetrahedron;



public class Main {
	
	
	/*
	 * INSTRUCTIONS to Challenge 4: Read these first
	 * 
	 * Challenge 4 will be a little bit different. Your goal is simply to get the program to produce
	 * the correct output. To do this, you'll be filling out code and dealing with super/sub
	 * (parent/child) classes.
	 * 
	 * The reason this one will work a bit differently is because I'll be telling you exactly what
	 * to do for the majority of it, and teaching you along the way. The program will have a lot of
	 * similar code so, as we go on, I'll be giving you less and less instruction.
	 * 
	 * The program is simple. It's creating a bunch of shapes (both 2d and 3d) and printing out
	 * information about them.
	 * 
	 * -- For the 2d shapes, it's printing out the area, perimeter, and basic shape information of
	 * each, in addition to the shape type.
	 * 
	 * -- For the 3d shapes, it's printing out the volume, surface area, and basic shape information
	 * of each, in addition to the shape type.
	 * 
	 * You've also probably noticed that there are a bunch of errors in the code below. Those will
	 * go away as you fix the constructors in the code, so don't worry about them now.
	 * 
	 * Also, due to the fact that this program involves a lot of reading, I won't be timing it. Just
	 * try to get through it as fast as possible.
	 * 
	 * Alright, whenever you're ready, open up the dontOpenThisYet package and look at the
	 * StepByStepInstructions.txt file. That will be your guide for the rest of the program.
	 */
	
	
	public Main() {
		
		Shape2D[] shapes2d = new Shape2D[5];
		
		shapes2d[0] = new Circle(12.5);
		shapes2d[1] = new Oval(10.5, 11.0);
		shapes2d[2] = new Rectangle(5.0, 6.0);
		shapes2d[3] = new Square(4.0);
		shapes2d[4] = new Triangle(10.0, 5.0, 6.0, 10.0);
		
		print2DShapeArray(shapes2d);
		
		Shape3D[] shapes3d = new Shape3D[7];
		
		shapes3d[0] = new Cone(4.0, 50);
		shapes3d[1] = new Cube(12.0);
		shapes3d[2] = new Cylinder(4.5, 56.0);
		shapes3d[3] = new Pyramid(10.0, 10.0);
		shapes3d[4] = new RectangularPrism(10.0, 5.0, 2.5);
		shapes3d[5] = new Sphere(20.0);
		shapes3d[6] = new Tetrahedron(12.5);
		
		print3DShapeArray(shapes3d);
		
	}
	
	
	public static void main(String[] args) {
		new Main();
	}
	
	
	private void print2DShapeArray(Shape2D[] shapes) {
		String printout = "---------- 2D Shape Array Contains: ----------\n[";
		for (Shape2D shape2d : shapes) {
			printout += "\n_______________\n";
			printout += shape2d.toString();
			printout += "\n_______________";
		}
		printout += "\n]";
		System.out.println(printout);
	}
	
	
	private void print3DShapeArray(Shape3D[] shapes) {
		String printout = "---------- 3D Shape Array Contains: ----------\n[";
		for (Shape3D shape3d : shapes) {
			printout += "\n_______________\n";
			printout += shape3d.toString();
			printout += "\n_______________";
		}
		printout += "\n]";
		System.out.println(printout);
	}
	
}
