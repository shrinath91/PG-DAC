package my_number;

import Number_util.IntOperation;

public class MyNumber implements IntOperation {

	@Override
	public boolean isOdd(int num) {
		if(num%2==0)
			return false;
		else 
			return true;
	}
	@Override
	public boolean isEven(int num) {
		if(num%2==0)
			return true;
		else
			return false;
	}

	@Override
	public boolean isPrime(int num) {
		int i;
		for(i=2; i<=num/2; i++)
		{
			if(num%i==0)

				break;
		}
		if(i<(num/2))
			return true;
		else
			return false;
	}

	@Override
	public int calFactorial(int num)
	{	
		int res=1;
		for(int i=1; i<=num; i++)
		{
			res*=i;
		}
		return res;
	}

}
