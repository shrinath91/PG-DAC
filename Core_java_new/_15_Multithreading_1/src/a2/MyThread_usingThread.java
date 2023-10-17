package a2;

public class MyThread_usingThread extends Thread{

	public void run() {
		
		System.out.println("In Thread(using Thread): "+(Thread.currentThread()).getName());
		
		for(int i=1; i<=5; i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException in)
			{
				in.printStackTrace();
			}
			
		}
		
	}
	
}
