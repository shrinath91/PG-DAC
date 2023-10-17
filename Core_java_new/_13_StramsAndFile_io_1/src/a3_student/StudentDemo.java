package a3_student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentDemo {

	public static void main(String[] args) {

		int roll_no;
		String name;
		float marks;

		

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter Name: ");
			name = br.readLine();

			System.out.println("Enter roll: ");
			roll_no = Integer.parseInt(br.readLine());
			
			
			System.out.println("Enter Marks: ");
			marks = Integer.parseInt(br.readLine());
			
			Student s1 = new Student(roll_no, name, marks);
			System.out.println(s1);
			
			s1.displayGrade();
			
			br.close();
			
		} 
		catch (IOException i) {
			i.printStackTrace();
		}

	}

}
