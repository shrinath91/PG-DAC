package a3_stock;

public class Producer implements Runnable {

	Stock s;
	Thread t;
	boolean bRun;
	
	
	
	
	public Producer(Stock s) {
		super();
		this.s = s;
		bRun = true;
		this.t = new Thread(this);
	}


	@Override
	public void run()	
	{
		
		try 
		{
			while(bRun)
				s.produce();
		} 
		catch (InterruptedException e) 
		{
			
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
