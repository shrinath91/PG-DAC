package a4_Console_File_input_output;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Fileio {

	public static void main(String[] args) throws IOException {
		
		String file_name;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter file name: C:\\Users\\Shrinath\\OneDrive\\Desktop ");	
		file_name = br.readLine();
		
		File f = new File("C:\\Users\\Shrinath\\OneDrive\\Desktop\\"+file_name+".txt");
		
		if(f.exists())
		{
			String str=null;
//			BufferedWriter fw = new BufferedWriter(new FileWriter(f, true));//append

//			BufferedWriter fw = new BufferedWriter(new FileWriter(f));///////writing from file
			FileWriter fw = new FileWriter(f);///////writing from file
			System.out.println("Enter 'quit' to exit");
			while( !(str=br.readLine()).equals("quit")  )
			{
				fw.write(str);
				fw.write("\n");
			}
			fw.close();
			
			BufferedReader fr = new BufferedReader(new FileReader(f));///////////reading from file
			while((str=fr.readLine())!=null)
			{
				System.out.println(str);
			}
			
			
			//or method using only FileReader
//			FileReader fr = new FileReader(f);///////////reading from file
//			int n;
//			while((n=fr.read())!=-1)
//			{
//				System.out.print((char)n);
//			}
//			fr.close();
			
		}
		else
			System.out.println("File not Found!!");
		
		
		
		
		
	}
 
}


