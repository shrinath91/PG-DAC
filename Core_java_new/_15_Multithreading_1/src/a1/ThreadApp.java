package a1;

public class ThreadApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Thread t1 = Thread.currentThread();
		System.out.println("Name of thread: "+t1.getName());
		System.out.println("Priority: "+t1.getPriority());
		
		

	}

}
