package Maximum;

public class Maximum {

	public void findmaximum(int a, int b, int c) {
		if(a==b && b==c && c==a) {
			System.out.println("All are equal");
			
		}else if(a>b && a>c) {
			System.out.println(a+ " is large");
		}else if(b>c && b>a) {
			System.out.println(b+" is large");
		}else {
			System.out.println(c+"  is large");
		}
		// TODO Auto-generated method stub
		
	}
		
	

}
