package Student;

public class Student {
	private int roll;
	private String name;
	private float marks;
	
	public Student() {
		super();
	}
	public Student(int roll, String name, float marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	public float getMarks() {
		return marks;
	}
	
	public void display_Stud()
	{
		System.out.println("**********************");
		System.out.println("Roll: "+roll);
		System.out.println("Name: "+name);
		System.out.println("Marks: "+marks);
		System.out.println();
	}
	
	
	
	
	

}
