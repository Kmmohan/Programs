package dowhile;

public class Factorial {
	int num;
	public int factorailnumber(int num) {
		int i=1;
		int factorial=1;
		do{
			factorial=factorial*i;
			i++;
			
		}while(i<=num);
	 return factorial;
		
	}

}
