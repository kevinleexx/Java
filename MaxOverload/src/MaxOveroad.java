public class MaxOveroad {
	public static int max(int x, int y) {
		return x > y ? x : y;
	}

	public static double max(double x, double y) {
		return x > y ? x : y;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 7, y = 666;
		double a = 235.2, b = 424.1;
		System.out.println("x: " + x + ",y: " + y + ",Max: "
				+ MaxOveroad.max(x, y));
		System.out.println("x: " + a + ",y: " + b + ",Max: "
				+ MaxOveroad.max(a, b));
	}

}
