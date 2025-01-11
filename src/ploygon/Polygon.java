package ploygon;

public class Polygon {

	public String basedosides(int sides) {
		switch(sides) {
		case 1:
		case 2:
			return "not polygon";
			
		case 3:
			return "triangle";
		case 4:
			return "square";
		case 5:
			return "pentagon";
		case 6:
			return "Hexagon";
		case 7:
			return "Heptagon";
		case 8:
			return "octagon";
			
		}
		return null;
		// TODO Auto-generated method stub
		
	}

}
