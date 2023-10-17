package a4_Console_File_input_output;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Fileio {

	public static void main(String[] args) throws IOException {
		
		String file_name;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter file name: ");
		
		file_name = br.readLine();
		
		File f = new File("E:\\GitHub\\PG-DAC git\\Core_java_new\\_13_StramsAndFile_io_1\src\\a4_Console_File_input_outpu\\file_name");
		
		InputStream is = null;
		if(f.exist())
		{
			
		}

	}
 
}
