package prime;

public class Prime {

	public void checkprime(int num) {
		int count=1;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				System.out.println("Not prime");
			}else {
				count++;
			}
			if(count==2) {
		    	 System.out.println("prime");

			
			}
		}
		// TODO Auto-generated method stub
		
	}

}
