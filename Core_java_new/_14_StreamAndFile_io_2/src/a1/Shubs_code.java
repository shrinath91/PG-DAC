package a1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Shubs_code {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter file/folder name");
		String fileName = br.readLine();
		File f = new File("E:\\C-DAC\\_04Core Java\\FileIOData\\"+fileName);
//		
		if(f.exists()) {
			if(f.isFile()) {
				System.out.println("This is File");
				System.out.println("******************");
				if(f.length() > 25) {
					System.out.println("Reading Through BufferedReader beacouse size is greater than 25:");
					BufferedReader brf = new BufferedReader(new FileReader(f));
					String str = "";
					while((str = brf.readLine()) != null) {
						System.out.println(str);
					}
				}else {
					System.out.println("Reading Through FileInput && Reader beacouse size is less than 25:");
					InputStream is = new FileInputStream(f);
					Reader ris = new FileReader(f);
					//using stream i.e byte
					System.out.println("OutPut Throgh InputStream");
					int n = 0;
					while((n = is.read()) != -1) {
						System.out.print((char)n);
					}
					//using reader i.e character
					System.out.println("OutPut Through Reader");
					n = 0;
					while((n = ris.read()) != -1) {
						System.out.print((char)n);
					}
				}
			}else {
				//this will give you the number of files i.e this is directory
				System.out.println("This is Folder");
				System.out.println("************************************");
				File[] files = f.listFiles();
				System.out.println("Files in Directory:- "+fileName+" :");
				for(File fi : files) {
					System.out.println(fi);
				}
			}
		}else {
			System.out.println("File does'nt Exixts");
		}

	}

}

}
