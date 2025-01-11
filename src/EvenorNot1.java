import java.util.Scanner;

public class EvenorNot1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
//		 taking input from user
		System.out.println("Enter number: ");
		int number=scan.nextInt();
		checkNumberEvenorOdd(number);
		scan.close();
		// TODO Auto-generated method stub

	}

	private static void checkNumberEvenorOdd(int number) {
//		checking condition for even or odd
		if(number%2==0) {
			System.out.println("entered "+number+" is Even");
		}else {
			System.out.println("entered "+number+" is odd");
		}
		// TODO Auto-generated method stub
		
	}

}
