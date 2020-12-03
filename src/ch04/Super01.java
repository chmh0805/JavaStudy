package ch04;

class Car2 {
	
	String desc = "소나타의 부모입니다.";
	
	public Car2() {
		System.out.println("자동차");
	}
}

class Sonata extends Car2 {
	public Sonata() {
		super();
		System.out.println(super.desc);
		System.out.println("소나타");
	}
}

public class Super01 {

	public static void main(String[] args) {
		new Sonata();
	}

}
