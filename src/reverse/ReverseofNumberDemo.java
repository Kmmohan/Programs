package reverse;

import java.util.Scanner;

public class ReverseofNumberDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=scan.nextInt();
		ReverseofNumber s=new ReverseofNumber();
		s.reverse(num);
		
		// TODO Auto-generated method stub

	}

}
