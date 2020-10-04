package executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newSingleThreadExecutor();
		System.out.println("------Main thread start----------");
		for(int i=0;i<10;i++) {
			exec.execute(new TaskA());
		}
		System.out.println("------Main Thread end-------------");
		exec.shutdown();
	}

}
