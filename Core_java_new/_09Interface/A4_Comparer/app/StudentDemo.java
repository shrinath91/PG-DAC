package app;

import java.util.Scanner;


import Student.Student;
import comparer_util.Comparer;
import comparer_util.MeritComparer;
import comparer_util.NameComparer;
import comparer_util.RollComparer;

public class StudentDemo {

	public static void main(String[] args) {
		Student []arr = new Student[5];
		
		arr[0]= new Student(1, "Abc" , 99);
		arr[1]= new Student(2, "Abcd" , 89);
		arr[2]= new Student(3, "zbcde" , 79);
		arr[3]= new Student(4, "qbcdef" , 69);
		arr[4]= new Student(5, "ybc" , 59);
		
		int choice;
		do {
			System.out.println("1. Sort roll wise\n2.Sort name wise\n3.Sort marks wise\n please enter your choice: ");
			Scanner sc = new Scanner(System.in);
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				Comparer c1 = new RollComparer();
				for(int i=0; i<arr.length-1; i++)
				{
					for(int j=i+1; j<arr.length; j++)
					{
						if(c1.compare(arr[i],arr[j])>0)
						{
							Student temp=arr[i];
							arr[i]=arr[j];
							arr[j]=temp;
						}
					}
				}
				displayArr(arr);
				break;
				
			case 2:
				Comparer c2 = new NameComparer();
				for(int i=0; i<arr.length-1; i++)
				{
					for(int j=i+1; j<arr.length; j++)
					{
						if(c2.compare(arr[i],arr[j])>0)
						{
							Student temp=arr[i];
							arr[i]=arr[j];
							arr[j]=temp;
						}
					}
				}
				displayArr(arr);
				break;
				
			case 3:
				Comparer c3 = new MeritComparer();
				for(int i=0; i<arr.length-1; i++)
				{
					for(int j=i+1; j<arr.length; j++)
					{
						if(c3.compare(arr[i],arr[j])>0)
						{
							Student temp=arr[i];
							arr[i]=arr[j];
							arr[j]=temp;
						}
					}
				}
				displayArr(arr);
				
				break;
			}
			sc.close();
		}while(choice!=0);
		

	}
	
	public static void displayArr(Student []arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			arr[i].display_Stud();
		}
	}

}
