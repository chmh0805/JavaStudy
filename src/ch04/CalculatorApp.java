package ch04;

//���� 10, 5 �� ���ؼ�!!
//�� ������� ���� 20�� ���ؼ�
//�� ������� ���� 5�� ������
//�� ������� 100�� �� ���� ȭ�鿡 ����Ͻÿ�.
public class CalculatorApp {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		
		int answer = c1.add(10, 5);
		answer = c1.multi(answer, 20);
		answer = c1.divide(answer, 5);
		answer = c1.minus(answer, 100);
		System.out.println(answer);
		
	}

}
