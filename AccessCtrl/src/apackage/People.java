package apackage;

public class People {
	private final int height;
	private final int weight;
	private final double salary;

	public People() {
		height = 0;
		weight = 0;
		salary = 0;
		// TODO Auto-generated constructor stub
	}

	public People(int h, int w, double sa) {
		height = h;
		weight = w;
		salary = sa;

	}

	public void showHeight() {
		System.out.println(height);
	}

	protected void showWeight() {
		System.out.println(weight);
	}

	private void getSalary() {
		System.out.println(salary);
	}

	public void getgetSalary() {
		getSalary();
	}
}
