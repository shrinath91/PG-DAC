package apps;

import java.util.Scanner;

import Number_util.IntOperation;
import my_number.MyNumber;

public class MyNumberDemo {

	public static void main(String[] args) {

		int num;
		System.out.println("Enter Number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		IntOperation i= new MyNumber();
		System.out.println("IsOdd: "+i.isOdd(num));
		System.out.println("IsEven: "+i.isEven(num));
		System.out.println("IsPrime: "+i.isPrime(num));
		System.out.println("Factorial: "+i.calFactorial(num));
		
		sc.close();
	}

}
