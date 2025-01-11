package age;

import java.util.Scanner;

public class AgeDemo {

	public static void main(String[] args) {
//		taking input as age
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter age: ");
		int age=scan.nextInt();
//		creating a reference variable
		Age r=new Age();
//		calling a method
		r.basedonage(age);
		scan.close();
		
		// TODO Auto-generated method stub

	}

}
