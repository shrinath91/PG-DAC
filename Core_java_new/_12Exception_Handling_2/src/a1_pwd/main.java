package a1_pwd;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Password:");
		str = sc.next();
		
		if(3<str.length() && str.length()<12)
		{
			System.out.println("Valid Input!!!");
		}
		else
		{
			try
			{
				if(str.length()<3)
						throw new PasswordTooShort();				
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			
			try 
			{
				if(str.length()>12)
				{
					throw new PasswordTooLong();
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}

}
