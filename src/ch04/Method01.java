package ch04;

// 자바 특징 : 모든 코드는 class 내부에 둬야 한다.
// class 내부 : Heap에 보관
// method 내부 : stack에 보관
// static ~~ : static에 보관
public class Method01 {
	// method는 변수의 이름과 괄호를 가지고 있다.
	static void add() {
		System.out.println("add함수 호출됨");
	}
	
	void sound() {
		System.out.println("sound함수 호출됨");		
	}
	
	public static void main(String[] args) {
		Method01.add();
		
		Method01 m = new Method01(); // new 클래스명();을 하면 클래스가 들고 있는 static이 아닌 모든 것들이 Heap에 뜬다.
		m.sound();

	}

}
