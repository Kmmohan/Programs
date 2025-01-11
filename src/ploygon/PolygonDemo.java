package ploygon;

import java.util.Scanner;

public class PolygonDemo {

	public static void main(String[] args) {
//		Taking input as numberofsides
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number of sides of Polygon: ");
		int sides=scan.nextInt();
//		creating a reference variable
		Polygon r=new Polygon();
//		calling a method
		String s=r.basedosides(sides);
		System.out.println(s);
		scan.close();
		// TODO Auto-generated method stub

	}

}
