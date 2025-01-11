package gcd;

import java.util.Scanner;

public class GcdofNumbersDemo {

	public static void main(String[] args) {
//		Taking inputs from user
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1=scan.nextInt();
		System.out.println("Enter second number: ");
		int num2=scan.nextInt();
//		creating reference varaible for class
		GCDofNumbers r=new GCDofNumbers();
//		calling method
		r.findgcd(num1,num2);
		// TODO Auto-generated method stub

	}

}
