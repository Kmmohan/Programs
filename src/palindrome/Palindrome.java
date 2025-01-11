package palindrome;

public class Palindrome {

	int digit,sum=0;

	public void checkpalindrome(int num) {
		int temp=num;
		while(num>0) {
			
			digit=num%10;
			sum=sum*10+digit;
			num=num/10;
			}
		if(temp==sum) {
			System.out.println("palindrome number");
		}else {
			System.out.println("Not palindrome");
		}
		// TODO Auto-generated method stub
		
	}

}
