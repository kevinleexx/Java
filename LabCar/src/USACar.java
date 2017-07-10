public class USACar extends Car {

	public USACar() {
	}

	USACar(String model, String id, int price) {
		super(model, id, price);
	}

	@Override
	public double estimate() {
		return price * 0.6;
	}

}
