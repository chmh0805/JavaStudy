package ch02;

// ctrl + shift + f : ����
// �޼��� �ȿ� �޼��带 ������ �� ����. (JavaScript�� ����)
// ������ �޼��带 ���� �� ����.
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