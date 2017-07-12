
public class ThreadB extends Thread {
	int total;

	public void run() {
		try {
			sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized (this) {
			for (int i = 0; i < 100; i++) {
				total += 1;

			}
			notify();
		}
	}
}
