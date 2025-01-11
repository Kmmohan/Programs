package palindrome;

public class Armstrong {


	public void findarmstrong(int num) {
		int digit=0,sum=0;
		
		int temp=num;
		while(num>0) {
		digit=num%10;
		sum=(digit*digit*digit)+sum;
		num=num/10;
		}
	if(sum==temp) {
		System.out.println("armstrong number");
		
	}
	}

}
