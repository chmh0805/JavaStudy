package ch03;

public class Array01 {

	public static void main(String[] args) {
		// ���� ������ �����͵��� ���������� ����ȴ�.
		// ���� : �׼����� ������.
		// ���� : �迭�� ũ�⸦ �ø��ų� ���� �� ����.
		int[] num = new int[3]; // �迭�� �⺻ ����
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		num[0] = 50;
		System.out.println("num�� 0���� : " + num[0]);
		
//		ArrayIndexOutOfExcepteion
//		num[3] = 10; // ��Ÿ�� ���� �߻�
	}

}