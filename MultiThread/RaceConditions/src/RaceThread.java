
public class RaceThread {
	 int   count=0;
	 public  synchronized void Increment(){
		 count++;
		 try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	public class Race1 implements Runnable{
		@Override
		public void run(){
			
			for(int i=0;i<1500;i++)
			{
				Increment();
			}
			
		}
	}
	
    public class Race2 implements Runnable{
    	@Override
		public void run(){
			for(int i=0;i<1000;i++)
			{
				Increment();
			}
		}
	}
	public void Main(){
		Thread t1 = new Thread(new Race1());
		Thread t2 = new Thread(new Race2());
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The final count = "+count);
		System.out.println("All work done.");
	}

}
