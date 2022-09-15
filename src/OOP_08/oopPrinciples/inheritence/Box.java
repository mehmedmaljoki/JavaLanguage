package OOP_08.oopPrinciples.inheritence;

public class Box {
	double l;
	double h;
	double w;

	public Box() {
		this.h = -1;
		this.l = -1;
		this.w = -1;
	}

	// cube
	public Box(double side) {
		this.h = side;
		this.l = side;
		this.w = side;
	}

	public Box(double l, double h, double w) {
		this.l = l;
		this.h = h;
		this.w = w;
	}

	public Box(Box old) {
		this.l = old.l;
		this.h = old.h;
		this.w = old.w;
	}

	public void running() {
		System.out.println("Running the box");
	}
}
