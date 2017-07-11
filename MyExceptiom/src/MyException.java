import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CmyClass {
	private int numerator, denominator;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void setValue() throws NumberFormatException, IOException {
		System.out.println("輸入分子");
		numerator = Integer.parseInt(br.readLine());
		System.out.println("輸入分母");
		denominator = Integer.parseInt(br.readLine());
	}

	public void printValue() throws ArithmeticException {
		System.out.println("result is:" + numerator / denominator);
		System.out.println("devide end");

	}
}

public class MyException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CmyClass obj = new CmyClass();
		try {
			obj.setValue();
			obj.printValue();
		} catch (ArithmeticException e) {
			System.out.println("分母為0");
			// TODO: handle exception
		} catch (Exception e) {
			System.out.println("sth unexpected happens :(");
			// TODO: handle exception
		} finally {
			System.out.println("Finally...");
		}
	}

}
