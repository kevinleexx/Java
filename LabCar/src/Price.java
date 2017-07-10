import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Price {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int type = 1, price = 0;
		double estimate = 0.0;
		String[] options = { "Euro", "Japan", "USA" };
		String model = "", id = "";

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("choose a car to sell( 0:Euro  1:Japan  2:USA ) :");
		String setTypes = br.readLine();
		type = Integer.parseInt(setTypes);

		System.out.print("Please input car style( 0: RV 1: Sports Car ):");
		String setModel = br.readLine();
		int intmodel = Integer.parseInt(setModel);

		System.out.print("Please input your car ID: ");
		id = br.readLine();

		System.out.print("original price is:");
		String strPrice = br.readLine();
		price = Integer.parseInt(strPrice);

		switch (type) {
		case 0:
			EuroCar e = new EuroCar(model, id, price);
			estimate = e.estimate();
			break;
		case 1:
			JapCar j = new JapCar(model, id, price);
			estimate = j.estimate();
			break;
		case 2:
			USACar u = new USACar(model, id, price);
			estimate = u.estimate();
			break;
		}
		switch (intmodel) {
		case 0:
			model = options[type] + " RV";
			break;
		case 1:
			model = options[type] + " Sports Car";
			break;
		}
		System.out
				.println("-----------------------------------------------------------");
		System.out.println("Your car data:\nmodel: " + model + "\nID: " + id
				+ "\nPrice: " + price + "\nEstimate Price: " + estimate
				+ "\n           Thank you!");

	}
}
