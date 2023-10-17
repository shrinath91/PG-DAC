package a2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class MaxLine {

	public static void main(String[] args) throws Exception {
		String file_name;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter filename to search max line: ");
		file_name = br.readLine();
		
		br = new BufferedReader(new FileReader("E:\\GitHub\\PG-DAC git\\Core_java_new\\_14_StreamAndFile_io_2\\src\\"+file_name+".txt"));
//		br = new BufferedReader(new FileReader("E:\\GitHub\\PG-DAC git\\Core_java_new\\_14_StreamAndFile_io_2\\src\\a2_test.txt"));
		
		String str;
		int line_count=0;
		int max_Line_No=0;
		int max_str_len=0;
		while((str=br.readLine()) != null )
		{
			++line_count;
			if(str.length()>max_str_len)
			{
				max_Line_No = line_count;
				max_str_len = str.length();
			}
		}
		System.err.println("Line with max elemnts is at "+max_Line_No+" having "+max_str_len +"Characters");
		
		
		
		br.close();
	}
	
	

}
