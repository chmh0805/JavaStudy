package ch02;

// heap
class Zealot {
	String name = "질럿";
	int attack = 10;
	int armor = 5;
	
	static int hp = 100;
}

public class Var08 {
	public static void main(String[] args) {

		Zealot z = new Zealot(); // Heap에 띄우는 방법(!= static)
		// 이 경우, static을 제외한 값을 불러온다.
		System.out.println(z.name);
		System.out.println(z.attack);
		System.out.println(z.armor);
		
		Zealot z2 = new Zealot(); // 20번 라인에서 Zealot 생성됨.
		System.out.println(z2.name);
		System.out.println(z2.attack);
		System.out.println(z2.armor);
		
		z.attack = 50;
		
		System.out.println("변화 관찰");
		System.out.println(z.attack);
		System.out.println(z2.attack);
		
		Zealot.hp = 50;
		
		System.out.println(Zealot.hp);
		System.out.println(Zealot.hp);
		
		z.attack = 11;
		
		System.out.println(z.attack);
		System.out.println(z2.attack);
	}

}
