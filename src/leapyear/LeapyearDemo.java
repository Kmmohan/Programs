package leapyear;

import java.util.Scanner;

public class LeapyearDemo {

	public static void main(String[] args) {
//		taking input from user
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Year: ");
		int year=scan.nextInt();
//		creating a reference variable
        Leapyear r=new Leapyear();
//        calling amethod
        r.findleapyear(year);
		// TODO Auto-generated method stub

	}

}
