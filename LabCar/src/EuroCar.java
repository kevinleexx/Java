public class EuroCar extends Car {

	public EuroCar() {
	}

	EuroCar(String model, String id, int price) {
		super(model, id, price);
	}

	@Override
	public double estimate() {
		return price * 0.8;
	}

}
