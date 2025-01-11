package Factors.kn;
import java.util.Scanner;

public class FactorsofNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=scan.nextInt();
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				System.out.println(i);
			}
		}
		scan.close();
		// TODO Auto-generated method stub

	}
		// TODO Auto-generated method stub

	}


