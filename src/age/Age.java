package age;

public class Age {

	public void basedonage(int age) {
		if(age>=0 && age<=12) {
			System.out.println("child");
		}else if(age>=13 && age<=19) {
			System.out.println("Teen");
		}else if(age>=20 && age<=59) {
			System.out.println("Adult");
		}else {
			System.out.println("senior");
		}
		// TODO Auto-generated method stub
		
	}

}
