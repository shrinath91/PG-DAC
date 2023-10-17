package a2;

public class Mythread_usingRunnable implements Runnable {
	Thread t;
	public Mythread_usingRunnable() {
		t=new Thread(this);
	}
	public Thread getT() {
		return t;
	}
	public void run()
	{
		System.out.println("In thread(using Runnable): "+ (Thread.currentThread()).getName());
//		System.out.println("In thread: "+ t.getName());
		
		for(int i=1; i<=5; i++)
		{
			System.out.println("In Thread: "+i);
			try {
				Thread.sleep(100);
			} 
			catch (Exception e) {
				
				e.printStackTrace();
			}
		}
	}
	

}
