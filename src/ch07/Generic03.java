package ch07;

import java.util.Vector;

public class Generic03 {
	public static void main(String[] args) {
		// ����ȭ �Ǿ��ִ� �Ӱ� ����(Critical Section) (�������� �Ұ���)
		// ���α׷��ֿ��� ����ȭ : ���� ������ �ִ� ��
		// DB���� ����ȭ : �����Ͱ� ��ġ�ϴ� ��
		Vector<Integer> list1 = new Vector<>();
		// ������ ArrayList�� �����ϴ�.
		
		list1.add(100);
		list1.add(200);
		list1.add(1, 150);
		System.out.println(list1.get(1));
	}
}
