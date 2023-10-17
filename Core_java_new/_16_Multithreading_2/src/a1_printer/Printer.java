package a1_printer;

public class Printer {
	
	public synchronized void print(String header, String body, String footer ) throws InterruptedException
	{
		System.out.print(header);
		Thread.sleep(500);
		System.out.print(body);
		Thread.sleep(500);
		System.out.println(footer);
		Thread.sleep(500);
		
	}
	
}
