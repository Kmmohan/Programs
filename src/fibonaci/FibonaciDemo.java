package fibonaci;

import java.util.Scanner;

public class FibonaciDemo {

	public static void main(String[] args) {
//		Taking input as number
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=scan.nextInt();
//		creating reference variable for class
		Fibonaci r=new Fibonaci();
		r.findfebonaci(num);
		scan.close();
		
		// TODO Auto-generated method stub

	}

}
