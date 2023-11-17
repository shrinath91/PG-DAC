package stack_top_10;

public class demo {

	public static void main(String[] args) {
		int data;
		stack s1 = new stack();
		
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		s1.push(70);
		
		boolean s= s1.isFull();
		System.out.println(s);

		
		s1.pop();
		s1.pop();

		s1.pop();
		s1.pop();
		s1.pop();
		s1.display();
		s1.pop();
		s1.display();
		
//		data=s1.pop();
//		System.out.println(data);
	}

}
