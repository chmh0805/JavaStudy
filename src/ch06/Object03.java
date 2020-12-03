package ch06;

public class Object03 {
	public static void main(String[] args) {
		String str1 = "ȫ�浿";
		String str2 = "ȫ�浿";

		int num1 = 10;
		int num2 = 10;

		// ==�� ���� �׼����� �޸� ������ ������ ���Ѵ�.
		// String�� �ּҰ��� ����Ű�� reference�̱� ������ �ּҰ��� ���ϰ� �ǰ�,
		// int�� ���� ����ֱ� ������ ���� ���Ѵ�.
		System.out.println(str1 == str2);
		System.out.println(num1 == num2);

		// String�� hashCode �Լ��� �������̵� �Ǿ
		// ���� ���ڿ��̸� ���� �ؽ��� �̾Ƴ���.

		String str3 = "�Ӳ���"; // Heap ������ Constant Pool
		String str4 = new String("�Ӳ���"); // Heap

		// ���� �� ���� �����δ� �ٸ� �ּҰ��� ������ !
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());

		// == ���� ���� �� ������ true
		// == ���� ���ߴµ� false�� ������ ���������� ���� �� 		
		System.out.println(str3==str4); // false
		System.out.println(str3.equals(str4));
	}
	
}
