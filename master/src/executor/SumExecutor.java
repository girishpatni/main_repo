package executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SumExecutor {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		Future<Integer> sumA = exec.submit(new CallableSumTask(1001, 1283712));
		Future<Integer> sumB = exec.submit(new CallableSumTask(2, 3));
		exec.shutdown();
		try {
			System.out.println(sumA.get());
			System.out.println(sumB.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

}
