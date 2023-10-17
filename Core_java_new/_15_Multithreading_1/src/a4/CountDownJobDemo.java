package a4;

public class CountDownJobDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Runnable r1 = new CountDownJob("First" , 10);
		CountDownJob r2 = new CountDownJob("Second" , 20);
		Runnable r3 = new CountDownJob("Third" , 30);
		
		Thread t1 = new Thread(r1);
		t1.start();
		t1.join();
		
		
//		((Thread)(r2)).start();/// not possible
		r2.getT().start();
		r2.getT().join();
		 
//		
//		Thread t3 = new Thread(r3);
//		t3.start();
//		t3.join();
		
		((CountDownJob)r3).getT().start();
		((CountDownJob)r3).getT().join();
//		
		
		System.out.println("Main Thread ends!!!");
		System.out.println("Euuuuuuuuuuuu!!!");
		
	}

}
