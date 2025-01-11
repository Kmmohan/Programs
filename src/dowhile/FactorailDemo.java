package dowhile;

import java.util.Scanner;

public class FactorailDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=scan.nextInt();
		Factorial r=new Factorial();
		int s=r.factorailnumber(num);
		System.out.println(s);
		scan.close();
		
		// TODO Auto-generated method stub

	}

}
