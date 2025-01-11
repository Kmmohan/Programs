package Nestedcontrolconstruct;

import java.util.Scanner;

public class NestedConrrolConstruct {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=scan.nextInt();
		for(int i=1;i<=number;i++) {
			if(i%2==0) {
				System.out.println(i+" is even number");
				if(i%4==0) {
					System.out.println(i+" divisible by 4");
				}
			}
		}
		scan.close();
		// TODO Auto-generated method stub

	}

}
