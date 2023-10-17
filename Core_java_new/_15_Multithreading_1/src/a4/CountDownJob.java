package a4;

public class CountDownJob implements Runnable{

	private String name;
	private int n;
	private Thread t;
	
	
	public CountDownJob(String name, int n) {
		super();
		this.name = name;
		this.n = n;
		t = new Thread(this);
	}


	public void run()
	{
		for(int i=n; i<=0; i--)
		{
			System.out.println(i);
		}
	}
	
	public Thread getT()
	{
		return t;
	}

	
}
