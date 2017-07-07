import java.util.Arrays;

public class CTriangle {
	public int[] edge = { 0, 0, 0 };

	public CTriangle() {
		edge[0] = 3;
		edge[1] = 4;
		edge[2] = 5;
	}

	public CTriangle(int a, int b, int c) {
		this();
		if (isLegal(a, b, c)) {
			edge[0] = a;
			edge[1] = b;
			edge[2] = c;
		}
	}

	private boolean isLegal(int a, int b, int c) {
		if (a + b > c && a + c > b && b + c > a) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isRightAngle() {
		if (isLegal(edge[0], edge[1], edge[2])) {
			Arrays.sort(edge);
			if (edge[2] * edge[2] == edge[1] * edge[1] + edge[0] * edge[0])
				return true;
			else {
				return false;
			}
		} else {
			return false;
		}

	}
}
