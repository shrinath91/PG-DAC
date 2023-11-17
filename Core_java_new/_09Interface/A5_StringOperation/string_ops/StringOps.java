package string_ops;

import stringOperation_utility.StringOperation;

public class StringOps implements StringOperation {

	@Override
	public void reverse(String str) {
		//		String str2=null;
		System.out.print("Reverse: ");
		for(int i=str.length()-1; i>=0; i--)
		{
			//			str2=str2 + str.indexOf(i);
			System.out.print(str.charAt(i));
		}
		System.out.println();
		//		return str2;
	}

	@Override
	public void toUpperCase(String str) {
		System.out.println("Upper: "+str.toUpperCase());
	}

	@Override
	public int length(String str) {
		System.out.println("Length: "+str.length());
		return 0;
	}

	@Override
	public boolean isPallindrome(String str) {
		boolean flag =true;
		for(int i=0,j=str.length()-1; i<str.length();j--, i++) //< means length()-1
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				flag = false;
				break;
			}
		}	
		return flag;
	}

	@Override
	public String append(String str1, String str2) {
		str1=str1.concat(str2);
		
		return str1;
	}

}
