public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape = new Shape();
		Circle circle = new Circle(1, 5, 3);
		Cone cone = new Cone(3, 8, 4, 7);
		shape.draw();
		circle.draw();
		cone.draw();
	}

}
