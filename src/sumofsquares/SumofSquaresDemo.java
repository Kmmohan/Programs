package sumofsquares;

import java.util.Scanner;

public class SumofSquaresDemo {

	public static void main(String[] args) {
//		taking input from user
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=scan.nextInt();
//		creating a reference varible for class
		SumofSquares r=new SumofSquares();
//				calling a method
		r.findsumofsquares(num);
		// TODO Auto-generated method stub

	}

}
