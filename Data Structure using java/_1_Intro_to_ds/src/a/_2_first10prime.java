package a;

public class _2_first10prime {

	public static void main(String[] args) {

		int cnt=0;
		int num=2;
		boolean flag;
		
		System.out.println("First 10 prime: ");
		
		while(!(cnt==10))
//		while(cnt!=11)
		{
			flag=true;
			
			for(int i=2; i<num/2; i++)
			{
				if(num%i==0)
				{
					flag=false;
				}
			}
			if(flag)
			{
				cnt++;
				System.out.print(num+", ");
			}
			num++;
			
		}

	}

}
