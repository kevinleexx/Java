
public class ExceptionDemo {

	public static void main(String[] args) {
		new ExceptionDemo().doTheWork();
	}

	public void doTheWork() {
		Object o = null;
		for (int i = 0; i < 5; i++) {
			try {
				o = makeObj(i);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				System.err.println("Error:(" + e1.getMessage() + ").");
				return;
			}
			System.out.println(o);
		}
	}

	public Object makeObj(int type) throws IllegalArgumentException {
		if (type == 1)
			throw new IllegalArgumentException("Don't like type " + type);
		return new Object();
	}
}
