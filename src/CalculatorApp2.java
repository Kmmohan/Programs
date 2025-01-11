import java.util.Scanner;

public class CalculatorApp2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1=scan.nextInt();
		System.out.println("Enter second number: ");
		int num2=scan.nextInt();
		System.out.println("Enter your choice: ");
		char ch=scan.next().charAt(0);
		Calculator2 r=new Calculator2();
		r.decision(ch,num1,num2);
		
		// TODO Auto-generated method stub

	}

}
