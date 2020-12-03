package ch02;

// ctrl + shift + f : 정렬
// 메서드 안에 메서드를 정의할 수 없다. (JavaScript만 가능)
// 변수에 메서드를 담을 수 없다.
public class Method04 {
	
	int money = 10000; // heap

	void add(int num) { // int num : stack, void add : heap
		money = money + num;
	}

	public static void main(String[] args) {
		Method04 m = new Method04();
		m.add(50000);
		System.out.println(m.money);
	}

}