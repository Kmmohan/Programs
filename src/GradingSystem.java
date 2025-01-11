import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter marks: ");
		int marks=scan.nextInt();
		CheckGrade r=new CheckGrade();
		r.grade(marks);
		
		// TODO Auto-generated method stub

	}

}
