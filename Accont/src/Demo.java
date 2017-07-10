import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Account a = new Account(1000, "john", "8923354");
		Tranaction t = null;
		int r1, r2;
		String tranType = null, money = null, conti = null;
		do {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Choose a function: (1)deposit   (2)withdraw:");
			tranType = br.readLine();
			r1 = Integer.parseInt(tranType);
			switch (r1) {
			case 1:
				t = new Deposit(a);
				break;
			case 2:
				t = new Withdraw(a);
				break;
			}

			System.out.println("Please input transaction amount:");
			money = br.readLine();
			r2 = Integer.parseInt(money);
			t.amendBalance(r2);
			System.out.println("Continue transaction? Y/N:");
			conti = br.readLine();

		} while (conti.equals("Y") || conti.equals("y"));
		System.out.print("Dear " + a.getName() + ", your balance is: "
				+ a.getBalance() + "\nNumber of transaction object created:"
				+ Tranaction.count);

	}

}
