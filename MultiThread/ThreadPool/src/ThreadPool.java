import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class ThreadPool {
	public class Processor1 implements Runnable{
     int id;
		public Processor1(int id){
			this.id = id;
		}
		@Override
		public void run() {
			System.out.println("Thread "+id+" starting working.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread "+id+" finished.");
		}		
	}
	public class Processor2 implements Runnable{
	     int id;
			public Processor2(int id){
				this.id = id;
			}
			@Override
			public void run() {
				System.out.println("Thread "+id+" starting working.");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread "+id+" finished.");
			}		
		}
	public class Processor3 implements Runnable{
	     int id;
			public Processor3(int id){
				this.id = id;
			}
			@Override
			public void run() {
				System.out.println("Thread "+id+" starting working.");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread "+id+" finished.");
			}		
		}
	public class Processor4 implements Runnable{
	     int id;
			public Processor4(int id){
				this.id = id;
			}
			@Override
			public void run() {
				System.out.println("Thread "+id+" starting working.");
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread "+id+" finished.");
			}		
		}
	public class Processor5 implements Runnable{
	     int id;
			public Processor5(int id){
				this.id = id;
			}
			@Override
			public void run() {
				System.out.println("Thread "+id+" starting working.");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread "+id+" finished.");
			}		
		}
	public  void main(){
		ExecutorService executor = Executors.newFixedThreadPool(2);	
		executor.submit(new Processor5(5));
		executor.submit(new Processor4(4));
		executor.submit(new Processor3(3));
		executor.submit(new Processor2(2));
			executor.submit(new Processor1(1));		
		 executor.shutdown();
	}

}
