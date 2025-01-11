import java.util.Scanner;

public class ColorApp2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a month: ");
		String s=scan.next();
		Year r=new Year();
		r.display(s);
		// TODO Auto-generated method stub

	}

}
