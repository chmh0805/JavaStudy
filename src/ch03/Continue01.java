package ch03;

import java.util.Scanner;

public class Continue01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������ 5�� �Է��ϼ���.");
		int sum = 0;
		
		for (int i=0; i<5; i++) { // 5�� ȸ��
			int n = sc.nextInt(); // Ű���忡�� ���� �Է�
			
			if (n <= 0) { // �����̰ų� 0�̸�
				continue; // ��� ���� �ݺ������� �Ѿ�� ��ɾ�
//				break; // ���� ������ for���� ���
			} else {
				sum = sum + n;
			}
			System.out.println("���"); // continue�� ����Ǹ� �ش� ���� ������� �ʴ´�.
		} // end of for
			
		System.out.println("����� ���� " + sum);
		
		sc.close(); // scanner�� �ݾ��ش�.
		
	}

}
