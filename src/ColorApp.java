import java.util.Scanner;

public class ColorApp {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter alphabet: ");
		char ch=s.next().charAt(0);
		Color r=new Color();
		r.rainbow(ch);
		
		
		// TODO Auto-generated method stub

	}

}
