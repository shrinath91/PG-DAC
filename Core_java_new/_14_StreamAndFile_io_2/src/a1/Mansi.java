package a1;

package a1;

import java.io.File;
import java.io.FileReader;

public class Mansi 
{
	public static void main(String []args) throws Exception
	{
		File f = new File("D:\\javaPrograms\\Packages\\Data.java");
	
		
		if(f.isFile())
		{
			
			FileReader fr=new FileReader(f);
			System.out.println(f.length());
			int n;
			while((n=fr.read())!= -1)
			{
				System.out.print((char)n);
			}
		
		}
		else if(f.isDirectory())
		{
			System.out.println("in directory");
			File []files= f.listFiles();
			for(File fl:files)
			{
				System.out.println(fl.getName());
			}
		}
		
	}

}