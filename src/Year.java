
public class Year {
	public void display(String s) {
		switch(s) {
		case "January":
		case "Febraury":
		case "March":
			System.out.println("Quarter1");
			break;
		case "April":
		case "May":
		case "June":
			System.out.println("Quarter2");
			break;
		case "July":
		case "August":
		case "September":
			System.out.println("Quarter3");
			break;
		case "october":
		case "November":
		case "December":
			System.out.println("Quarter4");
			break;
	    default:
	    	System.out.println("Invalid choice");
		}
	}

}
