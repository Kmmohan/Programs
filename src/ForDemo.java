import java.util.Scanner;

public class ForDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=scan.nextInt();
		for(int j=1;j<=num;j++) {
			System.out.println(j);
		}
		scan.close();
		
		// TODO Auto-generated method stub

	}

}
