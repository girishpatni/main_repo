package executor;

import java.util.concurrent.ThreadFactory;

public class NamedThreadFactory implements ThreadFactory {

	private static int count=0;
	private static final String NAME="WorkerThread-";
	@Override
	public Thread newThread(Runnable r) {
		Thread th = new Thread(r,NAME+count);
		count++;
		return th;
	}

}
