package ch03;

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {
		// Scanner�� �̿��ϸ� I/O ��ġ�� ���� ���� !!
		// class���� ���� �� static Ž�� -> main�Լ� ����
		// main�Լ� ���� �ÿ� "main"�̶�� �̸��� ���� thread�� �����ǰ� ����ȴ�.
		// �� thread�� main stack�� ����Ǵ� ������ ����ȴ�.
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // ���ŷ
		
		System.out.println("�Է¹��� �� : "+num);
		sc.close();
	}

}
