package a2;

public class ThreadApp 
{

	public static void main(String[] args) throws Exception
	{
		
		/*Thread t1 = new MyThread_usingThread();
		t1.start();     
		t1.join();    //using Thread class*/
		
		
		Runnable r = new Mythread_usingRunnable();
	//	((Mythread_usingRunnable)r).
		
		Thread t2 = new Thread(r);
		t2.start();
		//t2.join();
		((Mythread_usingRunnable)r).getT().join();
		/*((MyThread_usingThread)r).join();
		
		Thread t3 = Thread.currentThread();
		System.out.println("In : "+t3.getName());*/
		
		
		
		
		
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