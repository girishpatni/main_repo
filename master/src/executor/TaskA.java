package executor;

public class TaskA implements Runnable{
	private static int count=0;
	private int id;
	
	public TaskA() {
		this.id=++count;
	}
	@Override
	public void run() {
		System.out.println(String.format("---------TaskA with Id <%s> Start---------",id));
		try {
			Thread.sleep((long)Math.random()*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(String.format("---------TaskA with Id <%s> end---------",id));
	}
}
