package ch03;

public class If01 {

	public static void main(String[] args) {
		
		// ǥ����(expression)
		if(true) {
			System.out.println("true �Դϴ�.");
		}
		
		if(false) {
			System.out.println("����ȵ�(dead code)");
		}
		
		int num = 5;
		
		if(num >= 1) {
			System.out.println("num�� 1���� Ů�ϴ�.");
		} else { // ���� ���ǽ��� false��� �Ʒ��� ����
			System.out.println("num�� 1���� �۽��ϴ�.");
		}
		
		int sum = 20;
		
		if (sum == 10) {
			System.out.println("sum�� 10�Դϴ�.");
		} else if (sum == 20) { // ���� ���ǽ��� false��� �ش� ���ǽ��� Ȯ��
			System.out.println("sum�� 20�Դϴ�.");
		} else {
			System.out.println("sum�� 30�Դϴ�.");
		}
		
	}

}
