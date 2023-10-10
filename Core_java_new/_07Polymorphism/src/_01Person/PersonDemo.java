package _01Person;


public class PersonDemo {

	public static void main(String[] args) {
		Employee e1;
		e1=new Employee();
//		e1.display();
		System.out.println(e1.toString());
		System.out.println("*************************");
		
		Person p1;
		p1=new Employee();
//		p1.display();
		System.out.println(p1.toString());
		System.out.println("*************************");
		
		Person p2 = new Employee("Shri",12,4,2001,111,20000);
//		p2.display();
		System.out.println(p2.toString());
		System.out.println("*************************");

	}

}
