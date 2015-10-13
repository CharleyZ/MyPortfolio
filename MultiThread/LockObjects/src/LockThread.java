
public class LockThread {
	int count = 0;
	private Object lock = new Object();
	public class T1 implements Runnable{

		@Override
		public void run() {
			long start = System.currentTimeMillis();
			synchronized(lock){
			for (int i=0;i<1000;i++)
			{
				count++;
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(count);
			}
			long end = System.currentTimeMillis();
			System.out.println("Time spent by Thread 1 is : "+(end-start));
		}
		
	}
	public class T2 implements Runnable{
		@Override
		public void run() {
			long start = System.currentTimeMillis();
			synchronized (lock){
			for (int i=0;i<1000;i++)
			{
				count++;
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			count = count-500;
			System.out.println(count);
			}
			long end = System.currentTimeMillis();
			System.out.println("Time spent by Thread 2 is : "+(end-start));
	}
	}
	public void Main(){
		Thread t1 = new Thread(new T1());
		Thread t2 = new Thread(new T2());
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
