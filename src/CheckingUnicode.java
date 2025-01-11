import java.util.Scanner;

public class CheckingUnicode {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter character: ");
		char alphabet=scan.next().charAt(0);
		checkUnicodeForAlpahabet(alphabet);
		scan.close();
		// TODO Auto-generated method stub

	}

	public static void checkUnicodeForAlpahabet(char alphabet) {
		if(alphabet>=65 && alphabet<=90 ) {
			System.out.println("enter large aplhabet");
		}else {
			System.out.println("enter small alphabet");
		}
		// TODO Auto-generated method stub
		
	}

}
