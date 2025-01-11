package Nestedcontrolconstruct;

import java.util.Scanner;

public class NestedControlConstruct2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=scan.nextInt();
		for(int i=1;i<=number;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		scan.close();
		// TODO Auto-generated method stub

	}

}
