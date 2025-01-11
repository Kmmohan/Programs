package armstrong;

import java.util.Scanner;

import palindrome.Armstrong;

public class ArmstrongDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=scan.nextInt();
		Armstrong s=new Armstrong();
		s.findarmstrong(num);
		// TODO Auto-generated method stub

	}

}
