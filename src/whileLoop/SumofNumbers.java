package whileLoop;

public class SumofNumbers {
	int num;
	public void sum(int num) {
		int sum=0;
		while(num>=1) {
			sum+=num;
			num--;
		}
		System.out.println("sum: "+sum);
	}

}
