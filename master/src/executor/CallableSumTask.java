package executor;

import java.util.concurrent.Callable;

public class CallableSumTask implements Callable<Integer> {
	private int num1;
	private int num2;
	private String taskId;
	private static int tCount = 0;

	public CallableSumTask(int a, int b) {
		this.num1 = a;
		this.num2 = b;
		++tCount;
		this.taskId = "TaskB" + tCount;
	}

	public Integer call() throws InterruptedException {
		System.out.println(String.format("---Thread [%s] , Task ID: [%s] start---------",
				Thread.currentThread().getName(), taskId));
		Thread.sleep(100);
		return num1 + num2;
	}
}
