package executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("-----------Main Thread Start----------");
		ExecutorService exec = Executors.newCachedThreadPool(new NamedThreadFactory());
		for(int i=0;i<4;i++) {
			exec.execute(new TaskB());
		}
		Thread.sleep(100);
		for(int i=0;i<4;i++) {
			exec.execute(new TaskB());
		}
		exec.shutdown();
		System.out.println("-----------Main Thread Ends----------");

	}

}
