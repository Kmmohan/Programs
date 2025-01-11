package Maximum;

import java.util.Scanner;

public class MaximumDemo {

	public static void main(String[] args) {
//		Taking input three integers a,b,c
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter First integer: ");
		int a=scan.nextInt();
		System.out.println("Enter second integer: ");
		int b=scan.nextInt();
		System.out.println("Enter third integer: ");
		int c=scan.nextInt();
//		creating a reference variable
		Maximum r=new Maximum();
//		calling a method
		r.findmaximum(a,b,c);
		scan.close();
		// TODO Auto-generated method stub

	}

}
