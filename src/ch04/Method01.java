package ch04;

// �ڹ� Ư¡ : ��� �ڵ�� class ���ο� �־� �Ѵ�.
// class ���� : Heap�� ����
// method ���� : stack�� ����
// static ~~ : static�� ����
public class Method01 {
	// method�� ������ �̸��� ��ȣ�� ������ �ִ�.
	static void add() {
		System.out.println("add�Լ� ȣ���");
	}
	
	void sound() {
		System.out.println("sound�Լ� ȣ���");		
	}
	
	public static void main(String[] args) {
		Method01.add();
		
		Method01 m = new Method01(); // new Ŭ������();�� �ϸ� Ŭ������ ��� �ִ� static�� �ƴ� ��� �͵��� Heap�� ���.
		m.sound();

	}

}
