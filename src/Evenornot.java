import java.util.Scanner;

public class Evenornot {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter num= ");
		int num=scan.nextInt();
		if(num%2==0) {
			System.out.println(num+" is even");
		}
		scan.close();
		
		// TODO Auto-generated method stub

	}

}
