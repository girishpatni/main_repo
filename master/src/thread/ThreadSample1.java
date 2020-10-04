package thread;

public class ThreadSample1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("-----Starting the main thread here----");
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Anonymous inner class implementation for runnable");
			}

		});
		t1.join();
		t1.start();
		System.out.println("------Ending main thread here----");
	}

}

class MyThread implements Runnable {
	private static int count = 0;
	private int id;// to identify the thread

	public MyThread() {
		this.id = ++count;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hi this is thread :" + this.id);
			try {
				Thread.sleep(10);
				;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
