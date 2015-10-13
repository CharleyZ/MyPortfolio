import java.util.concurrent.*;

public class CountdownLatch {

	public class Processor1 implements Runnable{
		
		private CountDownLatch latch;
		
		public  Processor1(CountDownLatch latch){
			this.latch = latch;
		}
		@Override
		public void run(){
			System.out.println("Processor 1 Started");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Processor 1 finished");
			latch.countDown();
		}
	}
	
public class Processor2 implements Runnable{
		
		private CountDownLatch latch;
		
		public  Processor2(CountDownLatch latch){
			this.latch = latch;
		}
		@Override
		public void run(){
			System.out.println("Processor 2 Started");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Processor 2 finished");
			latch.countDown();
		}
	}
public class Processor3 implements Runnable{
	
	private CountDownLatch latch;
	
	public  Processor3(CountDownLatch latch){
		this.latch = latch;
	}
	@Override
	public void run(){
		System.out.println("Processor 3 Started");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Processor 3 finished");
		latch.countDown();
	}
}
	public void main(){
		CountDownLatch latch = new CountDownLatch(3);
		ExecutorService executor = Executors.newFixedThreadPool(2);	
		
		executor.submit(new Processor1(latch));
	    executor.submit(new Processor2(latch));
	    executor.submit(new Processor3(latch));
			
		
		try {
	        latch.await();  
	    } catch (InterruptedException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }

	    System.out.println("Completed.");
	}

}
