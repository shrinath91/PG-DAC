package string_main;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = new String("Hello123");
		
		printSeperateLine(str);
		printAscii(str);
		printOppositeCase(str);
		printCount_Vow_Con(str);
		printCount_special_char(str);
		
		
		

	}
	public static void printSeperateLine(String str)
	{
		for(int i=0; i<str.length(); i++)
		{
			System.out.println(str.charAt(i));
		}
		System.out.println("********************************");
	}

	private static void printAscii(String str) {
		// TODO Auto-generated method stub
		for(int i=0; i<str.length(); i++)
		{
			System.out.println((int)(str.charAt(i)));
		}
		System.out.println("********************************");
	}
	private static void printOppositeCase(String str) {
		// TODO Auto-generated method stub
		for(int i=0; i<str.length(); i++)
		{
			if('A'< str.charAt(i) && str.charAt(i) < 'Z')
				System.out.println((char)(str.charAt(i)+32));
			
			else if(97< str.charAt(i) && str.charAt(i) < 122)
				System.out.println((char)(str.charAt(i)-32));
			else 
				System.out.println(str.charAt(i));
		}
		System.out.println("********************************");
	}
	
	public static void printCount_Vow_Con(String str)
	{
		int count_vow=0;
		int count_con=0;
		for(int i=0; i<str.length(); i++)
		{
			if('a'==str.charAt(i)||'e'==str.charAt(i)||'i'==str.charAt(i)||'o'==str.charAt(i)||'u'==str.charAt(i))
			{
				count_vow++;
			}
			
			if(str.charAt(i)>='a' && 'z'>=str.charAt(i) || str.charAt(i)>='A' && 'Z'>=str.charAt(i))
			{
				count_con++;
			}
			
			
				
		}
		System.out.println("Vowels: "+ count_vow);
		System.out.println("Consonets: "+ (count_con - count_vow));
	}
	public static void printCount_special_char(String str)
	{
		int count_vow=0;
		int count_con=0;
		for(int i=0; i<str.length(); i++)
		{
			if('a'==str.charAt(i)||'e'==str.charAt(i)||'i'==str.charAt(i)||'o'==str.charAt(i)||'u'==str.charAt(i))
			{
				count_vow++;
			}
			
			else if(str.charAt(i)>='a' && 'z'>=str.charAt(i) || str.charAt(i)>='A' && 'Z'>=str.charAt(i))
			{
				count_con++;
			}
			System.out.println("Vowels: "+ count_vow);
			System.out.println("Consonets: "+ (count_con - count_vow));
			System.out.println("Special Char: "+(str.length()- count_vow -count_con)  );
			
				
		}
	}
}
