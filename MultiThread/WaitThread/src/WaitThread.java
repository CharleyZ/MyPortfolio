

public class WaitThread {
	private Object monitor = new Object();
	private boolean processing = true;
public class Thread1 implements Runnable{
	@Override
	public void run(){
		System.out.println("Thread 1 working");
		synchronized(monitor){
		try {
			Thread.sleep(500);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("Thread 1 paused");
		while(processing){			
			try {
				monitor.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Thread 1 Resumed");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("Thread 1 finished");
	}
	}
}
public class Thread2 implements Runnable{
	@Override
	public void run(){
		synchronized(monitor){
			
		System.out.println("Thread 2 working");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		processing = false;
		System.out.println("Thread 2 finished");
		monitor.notifyAll();
	}
	}
}
	public void main() {
		Thread t1 = new Thread(new Thread1());
		Thread t2 = new Thread(new Thread2());
		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	t2.start();

}
}
