import java.util.Scanner;

public class FindDays {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number between 1 and 7: ");
		int day=scan.nextInt();
		Weekday r=new Weekday();
		r.findday(day);
		
		// TODO Auto-generated method stub

	}

}
