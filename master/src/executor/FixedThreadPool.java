package executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {

	public static void main(String[] args) {
		System.out.println("----------Main Thread starts---------");
		ExecutorService exec = Executors.newFixedThreadPool(4);
		for(int i=0;i<10;i++) {
			exec.execute(new TaskB());
		}
		exec.shutdown();
		System.out.println("----------Main Thread Ends------------");

	}

}
