
public class Cone extends Circle {
	private int height;

	public Cone() {
		height = 0;
	}

	public Cone(int x, int y, int r,int h) {
		super(x, y,r);
		height=h;
	}

	public void setHeight(int h) {
		height=h;
	}

	public int getHeight() {
		return height;
	}

	public void draw() {
		super.draw();	
		System.out.println("Height: " + height);
	}
} 
	


