public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CTriangle[] objarr = new CTriangle[10];
		for (int i = 0; i < 10; i++) {
			int[] tmpobjarr = makethreeNum();
			objarr[i] = new CTriangle(tmpobjarr[0], tmpobjarr[1], tmpobjarr[2]);
			if (i == 9) {
				objarr[9].edge[0] = 20;
				objarr[9].edge[1] = 21;
				objarr[9].edge[2] = 29;
			}
			String rightAngle = new String();
			if (objarr[i].isRightAngle() == true) {
				rightAngle = "is right angle triangle";
			} else {
				rightAngle = "is not right angle triangle";
			}
			System.out.println("3 sides are " + objarr[i].edge[0] + " "
					+ objarr[i].edge[1] + " " + objarr[i].edge[2] + " "
					+ rightAngle);

		}
	}

	public static int[] makethreeNum() {
		int[] rand = new int[3];
		rand[0] = (int) (25 * Math.random() + 5);
		rand[1] = (int) (41 * Math.random() + 9);
		rand[2] = (int) (61 * Math.random() + 29);
		return rand;

	}

}
