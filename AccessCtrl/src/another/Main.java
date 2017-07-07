package another;

import apackage.John;
import apackage.People;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People people = new People(10, 20, 30);
		Tom tom = new Tom(40, 50, 60);
		John john = new John(70, 80, 90);

		people.getgetSalary();
		people.showHeight();
		tom.showHeight();
		tom.getgetSalary();
		john.showHeight();
		john.getgetSalary();
	}

}
