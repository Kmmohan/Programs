package whileLoop;

import java.util.Scanner;

public class SumofNumberbyusinwhile {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=scan.nextInt();
		SumofNumbers r=new SumofNumbers();
		r.sum(num);
		scan.close();
		
		
		// TODO Auto-generated method stub

	}

}
