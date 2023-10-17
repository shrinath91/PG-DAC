package a3_stock;

public class ProducerConsumerDemo {

	public static void main(String[] args) throws InterruptedException {

		Stock s = new Stock();
		
		Producer p = new Producer(s);
		Consumer c = new Consumer(s);
		
		p.getT().start();
		c.getT().start();
		
		Thread.sleep(500);
		
		p.stopNow();
		c.stopNow();
		
		p.getT().join();
		c.getT().join();
		
		System.out.println("Total qty produced : "+s.qtyProduced);
		System.out.println("Total qty cosumed : "+s.qtyConsumed);
		
	}

}
