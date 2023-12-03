package a6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Display_LineNumber
{

	public static void main(String[] args) throws IOException
	{
		File f1 = new File("E:\\GitHub\\PG-DAC git\\Core_java_new\\_13_StramsAndFile_io_1\\src\\a5_copyingFile\\Demo1.txt");

		BufferedReader bfr = new  BufferedReader(new FileReader(f1));

		if(f1.exists())
		{
			String str;
			int cnt=0;
			while((str=bfr.readLine())!=null)
			{
				cnt++;
				System.out.println(cnt+": "+str);
			}
		}
		else
			System.out.println("File Not Found");


		bfr.close();
	}

}
