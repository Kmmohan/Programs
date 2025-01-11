
public class Calculator {
	void action(int num1,int num2,char ch) {
		if(ch=='+') {
			System.out.println("The addition is "+(num1+num2));
		}else if(ch=='-') {
			System.out.println("The subtraction of two numbers is "+(num1-num2));
		}else if(ch=='*') {
			System.out.println("The multiplication of two numbers is "+(num1*num2));
		}else if(ch=='/') {
			int c=num1/num2;
			double d=c;
			System.out.println("The division of two numbers is "+d);
		}else if(ch=='%') {
			System.out.println("The modulodivision of two numbers is "+(num1%num2));
		}
		
	}

}
