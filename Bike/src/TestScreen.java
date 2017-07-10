public class TestScreen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wheel w1 = new Wheel("16 inch", 16, 2000);
		Wheel w2 = new Wheel("20 inch", 20, 3000);
		Frame f1 = new Frame("Economic", "iron", 2000);
		Frame f2 = new Frame("City", "iron", 3000);
		Frame f3 = new Frame("Professional", "alloy", 5000);

		Bicycle b1 = new Bicycle(w1, f1);
		System.out.println("first bike's cost is: " + b1.getCost());
		Bicycle b2 = new Bicycle(w2, f1);
		System.out.println("second bike's cost is: " + b2.getCost());

		b1.changeWheel(w2);
		System.out.println("first bike's price after chaning wheels is: "
				+ b1.getCost());
		System.out.println("There're " + Bicycle.num + " bikes composed.");
	}

}
