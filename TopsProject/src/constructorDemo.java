
class Box {
	double width, height, depth;

	// Default constructor
	Box() {
		System.out.println("Default constructor called");
		width = 3;
		height = 4;
		depth = 5;
	}

	// Parameterized constructor
	Box(double width, double height, double depth) {
		System.out.println("Parameterized constructor called");
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	// Copy constructor
	Box(Box b) {
		System.out.println("Copy constructor called");
		width = b.width;
		height = b.height;
		depth = b.depth;
	}

	void volume() {
		System.out.println("Volume : " + (width * height * depth));
	}
}

public class constructorDemo {

	public static void main(String[] args) {

		// Default constructor object
		Box b1 = new Box();
		b1.volume();

		// Parameterized constructor object
		Box b2 = new Box(4, 5, 6);
		b2.volume();

		// Copy constructor object
		Box b3 = new Box(b2);
		b3.volume();
	}

}
