package a1_printer;

public class PrintingTask implements Runnable{
	
	Printer p;
	String header, body, footer;
	Thread t;
	
	
	
	public PrintingTask(Printer p, String header, String body, String footer) {
		super();
		this.p = p;
		this.header = header;
		this.body = body;
		this.footer = footer;
		this.t = new Thread(this);
	}

	public Thread getT()
	{
//		return new Thread(this);
		return t;
	}


	public void run()
	{
		try
		{
			p.print(header, body, footer);			
		}
		catch(InterruptedException i)
		{
			i.printStackTrace();
		}
	}

}
