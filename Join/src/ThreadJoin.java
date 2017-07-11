class CCar extends Thread {
	String manufacture;

	public CCar(String str) {
		manufacture = str;
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(manufacture + "is running");
		}
	}
}

public class ThreadJoin {

	public static void main(String[] args) {
		CCar obj1 = new CCar("Ford");
		CCar obj2 = new CCar("Toyota");

		obj1.start();

		try {
			obj1.join();
			System.out.println("obj1 finished");
			obj2.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
