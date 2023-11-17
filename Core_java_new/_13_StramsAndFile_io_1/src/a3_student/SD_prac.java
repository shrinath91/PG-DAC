package a3_student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SD_prac
{
	public static void main(String[] args) //throws IOException
	{
		int roll_no;
		String name;
		float marks;

		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter roll, name, marks");

			System.out.println("name");
			name = br.readLine();

			System.out.println("roll");
			roll_no=Integer.parseInt(br.readLine());

			System.out.println("marks");
			marks= Integer.parseInt(br.readLine());

			Student s1 = new Student(roll_no, name, marks);
			System.out.println(s1);
			s1.displayGrade();
		}
		catch(IOException i)
		{
			i.printStackTrace();
		}
	}
}
