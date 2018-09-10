package exercises;

public class MultiThreading extends Thread {

	public void run() {
		try {
			
			for(int i=0;i<100;i++) {
				//Thread.sleep(3000);
				System.out.println(i);
			}
		} catch (Exception e) {
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		MultiThreading m=new MultiThreading();
		//MultiThreading m1=new MultiThreading();
		System.out.println("Thread is on working");
		
		m.start();
		System.out.println("Thread is running");
		
		//m1.start();
		
		
	}

}
