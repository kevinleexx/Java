public class Circle extends Shape {
	private int radius;

	public Circle() {
		radius = 0;
	}

	public Circle(int x, int y, int r) {
		super(x, y);
		radius = r;
	}

	public void setRadius(int r) {
		radius = r;
	}

	public int getRadius() {
		return radius;
	}

	public void draw() {
		super.draw();
		System.out.println("Radius: " + radius);
	}
}
