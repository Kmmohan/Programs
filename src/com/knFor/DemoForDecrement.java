package com.knFor;

import java.util.Scanner;

public class DemoForDecrement {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Range: ");
		int num=scan.nextInt();
		for(int j=num;j>=1;j--) {
			System.out.println(j);
		}
		scan.close();
		
		// TODO Auto-generated method stub

	}

}
