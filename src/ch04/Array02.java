package ch04;

class job {

}

class Police extends job {
	String name = "°æÂû";
}

class Doctor extends job {
	String name = "ÀÇ»ç";
}



public class Array02 {

	public static void main(String[] args) {
		job[] human = new job[2];
		
		human[0] = new Police();
		human[1] = new Doctor();
		
		System.out.println(human[0]);
		System.out.println(human[1]);
	}

}
