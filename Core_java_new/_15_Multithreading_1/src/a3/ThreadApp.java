package a3;

public class ThreadApp 
{

	public static void main(String[] args) throws Exception
	{	
		Runnable r = new Mythread_usingRunnable();
		((Mythread_usingRunnable) r).getT().start();
//		((Mythread_usingRunnable)r).getT().join();
		
		Thread t = new Thread(r);
		t.join();
		
		
		Thread t2 = Thread.currentThread();
		System.out.println("In main: "+t2.getName());
		
		
		
		
		
	}

}



//
//Mythread_usingRunnable t = new Mythread_usingRunnable();
//t.getThread().start();
//
//Runnable r=new Mythread_usingRunnable()	;
//((Mythread_usingRunnable)r).getThread().start();
//Thread t1 = Thread.currentThread();
//System.out.println("Name of thread: "+t1.getName());
//System.out.println("Priority: "+t1.getPriority());