import java.util.Scanner;

public class VowelorConsonent {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
//		taking input from user
		System.out.println("Enter character: ");
		char character=scan.next().charAt(0);
		checkingVowelorConsonent(character);
		scan.close();
		// TODO Auto-generated method stub

	}

	public static void checkingVowelorConsonent(char character) {
//		checking condition for vowel or consonant
		if(character=='a'||character=='e'||character=='i'||character=='o'||character=='u'||character=='A'||character=='E'||character=='I'||character=='O'||character=='U')
		{
			System.out.println("enter character  "+character+" is vowel");
		}else {
			System.out.println("enter character  "+character+" is consonant");
			
		}
		// TODO Auto-generated method stub
		
	}

}
