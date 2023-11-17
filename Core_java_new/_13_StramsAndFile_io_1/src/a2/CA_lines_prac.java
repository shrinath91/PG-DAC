package a2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CA_lines_prac
{

	public static void main(String[] args) 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter quit to exit");
		String str;
		int str_length;
		String mx_str=null;
		int mx_length=0;

		try
		{
			while( !(str=br.readLine()).equals("quit")   )
			{
				System.out.println(str);
				str_length=str.length();
				if(mx_length<str_length)
				{
					mx_str=str;
					mx_length=str_length;
				}

			}
		}
		catch(IOException i)
		{
			i.printStackTrace();
		}
		finally
		{
			try
			{
				br.close();
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println(mx_str);
		System.out.println(mx_length);

	}

}
