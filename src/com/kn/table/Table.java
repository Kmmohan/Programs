package com.kn.table;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=scan.nextInt();
		for(int j=1;j<=10;j++) {
			System.out.println(num+"*"+j+"="+(num*j));
		}
		scan.close();
		
		// TODO Auto-generated method stub

	}

}
