package a3_stock;

public class Stock {
	
	int qtyProduced;
	int qtyConsumed;
	private boolean bProduced;
	
	public Stock() 
	{
		super();
		this.qtyProduced = 0;
		this.qtyConsumed = 0;
		this.bProduced = false;
	}
	
	public synchronized void produce() throws InterruptedException
	{
		if(bProduced)
			this.wait();				
		
		qtyProduced++;
		bProduced=true;
		System.out.println("Produce: "+qtyProduced);
				
		notify();
	}
	
	public synchronized void consume() throws InterruptedException
	{
		if(!bProduced)
			this.wait();
			
		qtyConsumed++;
		bProduced=false;
		System.out.println("Consumed: "+qtyConsumed);

		notify();
	}
	
	
}
	
	


