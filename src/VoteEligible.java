import java.util.Scanner;

public class VoteEligible {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 //taking input data from user
		System.out.println("enter your age= ");
		int age=scan.nextInt();
		checkEligibleForVoteorNot(age);
		scan.close();
		// TODO Auto-generated method stub

	}

	public static void checkEligibleForVoteorNot(int age) {
		 //checking condition for eligible
		if(age>=18) {
			System.out.println("your eligible for vote");
		}else {
			System.out.println("your not eligible for vote");
		}
		// TODO Auto-generated method stub
		
	}

}
