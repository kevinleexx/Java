public class Shape {
	private int x;
	private int y;

	public Shape() {
		x = 0;
		y = 0;
	}

	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getY() {
		return y;
	}

	public void draw() {
		System.out.println("x: " + x + ",y: " + y);
	}

}
