package reverse;

public class ReverseofNumber {
	int sum=0,digit=0;
	public void reverse(int num) {
		while(num>0) {
			
		
		digit=num%10;
		sum=sum*10+digit;
		num=num/10;
		}
		System.out.println("reverse of number: "+sum);
	   }
	}


