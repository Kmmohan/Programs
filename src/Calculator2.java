
public class Calculator2 {
	public void decision(char ch,int num1,int num2) {
		switch(ch) {
		case '+':
			System.out.println("the addition of two numbers is: "+(num1+num2));
			break;
		case '-':
			System.out.println("the  subtraction of two numbers is: "+(num1-num2));
			break;
		case '*':
			System.out.println("the multiplication of two numbers is: "+(num1*num2));
			break;
		case '/':
			System.out.println("the division of two numbers is: "+(num1/num2));
			break;
		case '%':
			System.out.println("the modulodivision of two numbers is: "+(num1%num2));
			break;
		default:
			System.out.println("Invalid choice");
			
			}
	}

}
