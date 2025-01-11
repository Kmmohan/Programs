package palindrome;

import java.util.Scanner;

public class PalindromeDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=scan.nextInt();
		Palindrome s=new Palindrome();
		s.checkpalindrome(num);
		
		// TODO Auto-generated method stub

	}

}
