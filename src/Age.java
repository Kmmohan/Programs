import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter age= ");
		int age=scan.nextInt();
		if(age>=18) {
			System.out.println("eligible for vote");
			scan.close();
			
		}
		// TODO Auto-generated method stub

	}

}
