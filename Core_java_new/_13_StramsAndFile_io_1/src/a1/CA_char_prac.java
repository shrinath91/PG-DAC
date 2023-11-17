package a1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CA_char_prac
{

	public static void main(String[] args) throws IOException
	{
		char ch;
		int cnt_alpa=0, cnt_dig=0;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("ENter q to quit");
		while( (ch= (char)br.read())!='q' )
		{
			if('a'<=ch && ch<='z' || 'A'<=ch && ch<='Z')
			{
				cnt_alpa++;
			}
			else if('0'<=ch && ch<='9')
			{
				cnt_dig++;
			}
			
			System.out.println(ch);
		}
		System.out.println("Alpha: "+cnt_alpa);
		System.out.println("Digits: "+cnt_dig);
	}

}
