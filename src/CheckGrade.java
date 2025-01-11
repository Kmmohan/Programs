
public class CheckGrade {
	int marks;
	void grade(int marks) {
		if(marks>90) {
			System.out.println("A grade");
		}else if(marks>75 && marks<=90) {
			System.out.println("B grade");
			
		}else if(marks>60 && marks<=75) {
			System.out.println("C grade");
		}else if(marks>45 && marks<=60) {
			System.out.println("D grade");
		}else if(marks>35 && marks<=45) {
			System.out.println("E grade");
		}else {
			System.out.println("F grade");
		}
	}

}
