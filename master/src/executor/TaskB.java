package executor;

public class TaskB implements Runnable {
	private static int count = 0;
	private int instanceId;
	private String taskId;

	@Override
	public void run() {
		System.out.println(
				String.format("---Thread [%s], Task ID: [%s] start-----", Thread.currentThread().getName(), taskId));
		try {
			Thread.sleep((long) Math.random() * 100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(
				String.format("---Thread [%s], Task ID: [%s] End-------", Thread.currentThread().getName(), taskId));
	}

	public TaskB() {
		this.instanceId = ++count;
		this.taskId = "TaskB" + instanceId;
	}

}
