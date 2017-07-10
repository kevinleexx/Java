public class JapCar extends Car {

	public JapCar() {
	}

	JapCar(String model, String id, int price) {
		super(model, id, price);
	}

	@Override
	public double estimate() {
		return price * 0.7;
	}

}
