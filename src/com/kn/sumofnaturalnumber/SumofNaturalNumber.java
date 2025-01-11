package com.kn.sumofnaturalnumber;

import java.util.Scanner;

public class SumofNaturalNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=scan.nextInt();
		int sum=0;
		for(int j=1;j<=num;j++) {
			sum=sum+j;
		}
		System.out.println("sum of "+num+" natural number: "+sum);
		scan.close();
		// TODO Auto-generated method stub

	}

}
