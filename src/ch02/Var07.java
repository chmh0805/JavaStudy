package ch02;

// 클래스 자료형
class Car {
	static int power = 2000;
	static String color = "하얀색";
	static String name = "소나타";
	static String type = "승용차";
}

public class Var07 {
	// static int power = 2000; <- Var07.power
	public static void main(String[] args) {
		System.out.println(Car.power);
		System.out.println(Car.color);
		System.out.println(Car.name);
		System.out.println(Car.type);
		System.out.println(2300*70000);
	}

}
