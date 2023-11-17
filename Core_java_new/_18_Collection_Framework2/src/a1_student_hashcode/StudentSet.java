package a1_student_hashcode;
import java.util.Set;
import java.util.HashSet;

public class StudentSet
{

	public static void main(String[] args)
	{
		Set<Student> stud = new HashSet<>();
		
		stud.add(new Student(1, "Daulat", "Goa", 35.5));
		stud.add(new Student(2, "Omkar", "Pune", 45));
		stud.add(new Student(3, "Tokas", "Goa", 67.5));
		stud.add(new Student(4, "Shyam", "Pune", 35.5));
		stud.add(new Student(5, "Gama", "Mumbai", 55.5));
		stud.add(new Student(6, "Ramadhir", "Pune", 35.5));
		stud.add(new Student(7, "Rocky", "Mumbai", 87.5));
		stud.add(new Student(8, "Kamal", "Mumbai", 48.5));
		stud.add(new Student(9, "Abdul", "Mumbai", 35.5));
		stud.add(new Student(10, "Vijay", "Pune", 67.3));
		stud.add(new Student(11, "Hari", "Rajasthan", 85.5));
		stud.add(new Student(12, "Suraj", "Goa", 89.5));
		stud.add(new Student(13, "Shubham", "Pune", 69.5));
		
		for(Student s: stud)
		{
			System.out.println();
			System.out.println(s);
		}
	}

}
