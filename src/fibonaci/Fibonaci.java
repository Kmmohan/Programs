package fibonaci;

public class Fibonaci {

	public void findfebonaci(int num) {
		if(num==0) {
			System.out.print(num);
		}else if(num==1) {
			System.out.println();
		}else if(num>2) {
			
		int  first=0,second=1,next=0;
		System.out.print(first+" "+second);
		for(int i=3;i<=num;i++) {
			next=first+second;
			first=second;
			second=next;
			System.out.print(" "+next);
		}
		}
		// TODO Auto-generated method stub
		
	}

}
