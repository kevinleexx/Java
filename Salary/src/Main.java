import java.util.Scanner;;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner scanIn = new Scanner(System.in);
		int hour=0;
		double mph=0;
	
		System.out.println("Please input working hour:");
		hour = Integer.parseInt(scanIn.nextLine());
		System.out.println("Please input working wage:");
		mph = Double.parseDouble(scanIn.nextLine());
		System.out.println("You will get:");
		System.out.print(Salary.money(hour, mph));
		

	}

}
