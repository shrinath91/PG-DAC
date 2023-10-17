package a1_printer;

public class PrintingTaskDemo {

	public static void main(String[] args) throws InterruptedException{
		
		Printer p = new Printer();
		
		PrintingTask p1 = new PrintingTask(p, "{", "Hello world of java!!!", "}");
		PrintingTask p2 = new PrintingTask(p, "[", "Welcome to know-It", "]");
		PrintingTask p3 = new PrintingTask(p, "(", "Welcome to world of multi-threading", ")");
		
		
		p1.getT().start();
		p2.getT().start();
		p3.getT().start();
		
//		try
		{
			p1.getT().join();
			p2.getT().join();
			p3.getT().join();			
		}
//		catch(Exception e)
		{
//			e.printStackTrace();
		}
		
		
		
		
	}

}
