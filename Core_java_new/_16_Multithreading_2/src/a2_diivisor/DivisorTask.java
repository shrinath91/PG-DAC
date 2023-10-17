package a2_diivisor;

import java.io.FileWriter;
import java.io.IOException;

public class DivisorTask implements Runnable{

	FileWriter fw;
	Thread t;
	int num;
	
	
	public DivisorTask(FileWriter fw, int num) {
		super();
		this.fw = fw;
		this.num = num;
		this.t = new Thread(this);
	}

	public Thread getT()
	{
		return t;
	}

	public void run()
	{
		
		synchronized(fw)
		{
			try 
			{
					fw.write("\nDivisor of"+num+": ");
					
					for(int i=1; i<=num; i++)
					{
						if(num%i==0)
						{
							fw.write(i+" ");
							if(i<num-1)
								fw.write(",");
							
						}				
					}				
				
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		
	}
}
