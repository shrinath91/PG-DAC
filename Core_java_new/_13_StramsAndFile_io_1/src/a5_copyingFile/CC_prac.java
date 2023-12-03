package a5_copyingFile;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CC_prac
{

	public static void main(String[] args) throws IOException
	{
		File f1 = new File("E:\\GitHub\\PG-DAC git\\Core_java_new\\_13_StramsAndFile_io_1\\src\\a5_copyingFile\\Demo1.txt");
		File f2 = new File("E:\\GitHub\\PG-DAC git\\Core_java_new\\_13_StramsAndFile_io_1\\src\\a5_copyingFile\\Demo2.txt");

		FileReader fr = new FileReader(f1);
		FileWriter fw = new FileWriter(f2);
		
		if(f1.exists())
		{
			int n;
			while((n=fr.read())!=-1)
			{
				fw.write((char)n);
			}
			System.out.println("Copy Done");
		}
		else
			System.out.println("File Not Found");
		
		
		fr.close();
		fw.close();

	}

}
