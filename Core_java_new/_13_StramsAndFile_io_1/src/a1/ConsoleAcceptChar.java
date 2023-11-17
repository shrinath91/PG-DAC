package a1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleAcceptChar {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter 'q' to quit");
		int n;
		int count_alpha=0;
		int count_digi=0;
		try
		{
			while( (n=br.read())!='q' )
			{
				if('a'<=n&&n<='z' || 'A'<=n&&n<='Z')
					count_alpha++;
				else if(48<=n && n<=57)
					count_digi++;
				
				System.out.println((char)n);
			}
			System.out.println("Counts of alphabets: "+count_alpha);
			System.out.println("Counts of Digits: "+count_digi);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		try {
			br.close();			
		}
		catch(IOException i)
		{
			i.printStackTrace();
		}
	}

}
