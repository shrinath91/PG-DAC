package a4_paranthesis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Paranthesis {

	public static void main(String[] args) throws IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice;
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("Enter \n0.exit \n1.Continue");
			choice = sc.nextInt();

			System.out.print("Enter Paranthesis: ");
			String str = br.readLine();

			if(checkBalanced(str))
			{
				System.out.println("\tBalanced Paranthesis!!!\n");
			}
			else
				System.out.println("\tNot Balanced Paranthesis!!!\n");

		}while(choice!=0);
		sc.close();
		br.close();
	}





	public static boolean checkBalanced(String str)
	{
		boolean flag = true;
		cStack s = new cStack(str.length());

		if(str.length()%2!=0)
			flag = false;

		for(int i=0; i<str.length(); i++)
		{

			if(str.charAt(i)=='['  || str.charAt(i)=='{' || str.charAt(i)=='(' || str.charAt(i)=='<' )
				s.push(str.charAt(0));

			else if(str.charAt(i)==']'  || str.charAt(i)=='}' || str.charAt(i)==')' || str.charAt(i)=='>' )
			{
				if(s.peek()=='\n')
				{
					flag = false;
					return flag;
				}



				if(str.charAt(i) == ']' && s.peek() == '[')
					s.pop();
				else if(str.charAt(i) == ']' && s.peek() == '[')
					s.pop();
				else if(str.charAt(i) == '}' && s.peek() == '{')
					s.pop();
				else if(str.charAt(i) == ')' && s.peek() == '(')
					s.pop();
				else if(str.charAt(i) == '>' && s.peek() == '<')
					s.pop();
			}
			else 
				flag = false;

			if(!flag)
			{
				flag =  false;//not balanced
			}
		}
		
		
		return flag;
	}

}
//notok
//{}{{}{}}
//()(()())


//ok
