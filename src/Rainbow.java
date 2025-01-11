import java.util.Scanner;

public class Rainbow {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any color: ");
		char ch=scan.next().charAt(0);
		ColorCheck r=new ColorCheck();
		r.color(ch);
		// TODO Auto-generated method stub

	}

}
