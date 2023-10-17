package a3_stock;

public class Consumer implements Runnable{
	
	Stock s;
	Thread t;
	boolean bRun;
	public Consumer(Stock s) 
	{
		super();
		this.s = s;
		this.t = new Thread(this);
		this.bRun = true;
	}
	
	
	public void run() {
			try 
			{
				while(bRun)
					s.consume();
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	}
	
	public void stopNow()
	{
		bRun = false;
	}
	
	public Thread getT()
	{
		return t;
	}
	
	

}
