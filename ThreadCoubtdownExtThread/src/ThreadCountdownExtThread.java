
public class ThreadCountdownExtThread extends Thread {
	private int countDown = 5;
	private static int threadCount = 0;
	private int threadNumber = ++threadCount;

	public ThreadCountdownExtThread() {
		super();
		System.out.println("\nStrating thread number =>" + threadCount + "\n");

	}

	public void run() {
		while (true) {
			System.out.println(" - Thread number" + threadNumber + "(current Countdown = " + countDown + ")");
			for (int i = 0; i < 30000000; i++) {
			}
			if (--countDown == 0) {
				System.out.println("\nEnding thread number => " + threadNumber + "\n");
				return;
			}
		}
	}

	private static void doThreadCountDown() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			Thread.sleep(2000);
			new ThreadCountdownExtThread().start();
		}
		System.out.println("\n<< All threads have now been strated!! >>\n");

	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("\n<< MAIN METHOD(Begin) >>\n");
		doThreadCountDown();
		System.out.println("\n<< MAIN METHOD(end) >>\n");
	}

}
