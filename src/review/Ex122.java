package review;

class ����� {
	
	String data;
	
	String �ٿ�ε� () {
		data = "GTA5 ����";
		try {
			Thread.sleep(3000); // 1000 = 1��
		} catch (InterruptedException e) {
			System.out.println("������");
		}
		return data;
	}
}

// �ڹٴ� �޼��带 �Լ��� �Ű������� ������ �� ����.
// �ڹٴ� �޼��带 �Լ��� �Ű������� �����ϰ� ������ ������ �������̽��� �Լ��� ��ƾ� �Ѵ�.
// �͸�Ŭ������ �ѱ��.
public class Ex122 {
	public static void main(String[] args) {
		����� s = new �����();
		String game = s.�ٿ�ε�();
		System.out.println(game + " ����");
	}
}