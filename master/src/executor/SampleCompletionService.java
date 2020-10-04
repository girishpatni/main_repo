package executor;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SampleCompletionService {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();

		CompletionService<Integer> service = new ExecutorCompletionService<Integer>(exec);
		List<CallableSumTask> taskList = new ArrayList<>();
		taskList.add(new CallableSumTask(1, 2));
		taskList.add(new CallableSumTask(12, 15));
		taskList.add(new CallableSumTask(10001, 1000002));
		for (CallableSumTask task : taskList) {
			service.submit(task);
		}
		for (int i = 0; i < taskList.size(); i++) {
			try {
				System.out.println(service.take().get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		exec.shutdown();
	}

}
