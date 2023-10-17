package a3_student;

public class Student {
	
	private int roll_no;
	private String name;
	private float marks;
	private char grade;
	
	public Student() {
		super();
	}
	public Student(int roll_no, String name, float marks) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.marks = marks;
		this.grade = checkGrade(this.marks);
	}
	
	private char checkGrade(float marks)
	{
		
		if(marks<=100 && marks>=90)
			return 'A';
		else if(marks>=80)
			return 'B';
		else if(marks>=70)
			return 'C';
		else if(marks>=60)
			return 'D';
		else if(marks>=50)
			return 'E';	
		
		
		return 'F';
		
	}
	
	public void displayGrade()
	{
		System.out.println("Grade: "+grade);
	}
	
	
	@Override
	public String toString() {
		return "Roll No: "+roll_no+"\tName: "+name+"\tMarks: "+marks+"\n";
	}

}
