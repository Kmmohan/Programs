
public class Color {
	public void rainbow(char ch) {
		switch(ch) {
		case 'V':
		case 'v':
			System.out.println("voilet");
			break;
		case 'I':
		case 'i':
			System.out.println("Indigo");
			break;
		case 'B':
		case 'b':
			System.out.println("Blue");
			break;
		case 'G':
		case 'g':
			System.out.println("Green");
			break;
		case 'Y':
		case 'y':
			System.out.println("Yellow");
			break;
		case 'o':
		case 'O':
			System.out.println("Orange");
			break;
		case 'R':
		case 'r':
			System.out.println("Red");
			break;
		default:
			System.out.println("invalid choice");
		}
	}

}
