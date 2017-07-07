
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number mynum = new Number(77,7);
		mynum.print();
		
		System.out.println("Max number is:" + TestNum.max(mynum.getNum1(),mynum.getNum2()));
		
		TestNum.swap(mynum);
		mynum.print();
		
		
	}

}
