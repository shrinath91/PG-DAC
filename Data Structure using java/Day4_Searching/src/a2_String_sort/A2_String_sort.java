package a2_String_sort;
//using Selection sort
public class A2_String_sort 
{
	public static String[] sortString(String str[])
	{
		for(int i=0; i<str.length; i++)
		{
			for(int j=1; j<str.length; j++)
			{
				if(str[i].compareToIgnoreCase(str[j])>0)
				{
					String temp = str[j];
					str[j] = str[i];
					str[i] = temp;
				}
			}
		}
		return str;
	}
	public static void display(String str[])
	{
		for(int i=0; i<str.length; i++)
		{
			System.out.println(str[i]+" ");
		}
	}

	public static void main(String[] args) {

		String str[] = {"CCC","DDD","EEE","AAA","BBB"};
		
//		String str1[] = {new String("AA"), 
//				        new String("BBB")};
		
		display(sortString(str));

	}

}
