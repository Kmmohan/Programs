package binary;

import java.util.Scanner;

public class BinarytoDecimal {

	public static void main(String[] args) {
		int sum=0,digit=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=scan.nextInt();
		for(int e=0;num>0;e++) {
			digit=num%10;
			sum=sum+digit*((int)(Math.pow(2,e)));
			num=num/10;
			
		}
		System.out.println(sum);
		
		// TODO Auto-generated method stub

	}

}
