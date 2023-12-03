package a5_copyingFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyContent
{

	public static void main(String[] args) throws IOException
	{
		File f1 = new File("E:\\GitHub\\PG-DAC git\\Core_java_new\\_13_StramsAndFile_io_1\\src\\a5_copyingFile\\Demo1.txt");
		File f2 = new File("E:\\GitHub\\PG-DAC git\\Core_java_new\\_13_StramsAndFile_io_1\\src\\a5_copyingFile\\Demo2.txt");

		if(f1.exists() )
		{
			BufferedReader bfr = new BufferedReader(new FileReader(f1));
			BufferedWriter bfw = new BufferedWriter(new FileWriter(f2));
			
			int n;
			while((n=bfr.read())!=-1)
			{
				bfw.write((char)n);
			}
			System.out.println("Copy Done");
			
			bfr.close();
			bfw.close();
		}
		else
			System.out.println("File not Found!!");

		



	}
}


