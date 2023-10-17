package a1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class A1 {

	public static void main(String[] args) throws IOException  {
		String file_name;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter filename line: ");
		file_name = br.readLine();
		
		File f =  new File("E:\\GitHub\\PG-DAC git\\Core_java_new\\_14_StreamAndFile_io_2\\src\\"+file_name);
		
		if(f.isDirectory())
		{
			System.out.println("Its Directory");
			File []files = f.listFiles();
			for(File f1 : files) 
			{
				System.out.println(f1.getName());
			}
		}
		else if(f.isFile()) 
		{
			System.out.println("This is File");
			System.out.println("******************");
			if(f.length()>25)
			{
				System.out.println("Reading Through BufferedReader beacouse size is greater than 25:");
				BufferedReader brf = new BufferedReader(new FileReader(f));
				String str;
				while(  (str=brf.readLine()) != null)
				{
					System.out.println(str);
				}
			}
			else
				System.out.println("Reading Through FileInput && Reader beacouse size is less than 25:");
				InputStream is = new FileInputStream(f);
//				Reader ris = new FileReader(f);
				System.out.println("OutPut Throgh InputStream");
				int n = 0;
				while((n=is.read())!=-1)
				{
					System.out.println((char)n);
				}
				
			
		}
		
		
		
		br.close();
		}

}
