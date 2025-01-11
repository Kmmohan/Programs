import java.util.Scanner;

public class CalaculatorApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1=scan.nextInt();
		System.out.println("Enter second number: ");
		int num2=scan.nextInt();
		System.out.println("Enter your choice: ");
		char ch=scan.next().charAt(0);
		Calculator r=new Calculator();
		r.action(num1,num2,ch);
		scan.close();
		
		
		
		// TODO Auto-generated method stub

	}

}
