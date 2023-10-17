package a2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleAcceptLines {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter \"quit\" to exit");
		
		String str=null;
		try { 
			while(   !( (str=br.readLine()).equals("quit") )   )
			{
				System.out.println(str);
			}			
		}
		catch(IOException i)
		{
			i.printStackTrace();
		}
		try
		{
			br.close();			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
