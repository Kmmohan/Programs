package gcd;

public class GCDofNumbers {
	

	public void findgcd(int num1, int num2) {
    	int gcd=1;
		for(int i=1;i<=num1&&i<=num2;i++) {
			if(num1%i==0&&num2%i==0) {
				gcd=i;
			}
		}
		System.out.println(gcd);
		// TODO Auto-generated method stub
		
	}

}
