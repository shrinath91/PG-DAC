package a2_diivisor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivisorTask_Demo {

	public static void main(String[] args) throws IOException {

		int n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number to find Divisor: ");
		n = Integer.parseInt(br.readLine());
		
		
		File f = new File("E:\\GitHub\\PG-DAC git\\Core_java_new\\_16_Multithreading_2\\src\\a2_diivisor\\test2.dat");
		FileWriter fw = new FileWriter(f);
		
		DivisorTask d1 = new DivisorTask(fw,n);
		d1.getT().start();
		
		DivisorTask d2 = new DivisorTask(fw,200);
		d2.getT().start();

		DivisorTask d3 = new DivisorTask(fw,500);
		d3.getT().start();
		
		
		try
		{
			d1.getT().join();
			d2.getT().join();
			d3.getT().join();			
		}
		catch(InterruptedException i)
		{
			i.printStackTrace();
		}
		
		fw.write("\nEnd of main");
		fw.close();
		System.out.println("Data saved at File");
	}

}
