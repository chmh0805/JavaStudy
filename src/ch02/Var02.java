package ch02;

//�ڹٴ� .class ������ �����ϸ� static �κ��� �޸𸮿� �ε��Ѵ�.
//static ������ �ִ� main()�Լ��� ã�Ƽ� ȣ���ϰ�
//�� �� stack�� �����Ǵµ� �� stack�� �̸��� main�̶�� �Ѵ�.
//main�� stack ����Ǹ� ���α׷� ���� !!
public class Var02 {

	public static void main(String[] args) {
		// Code �κ�
		// ����
		int num = 10; // 4Byte - 32bit - 42�� 9õ ����� ��(�뷫 -20�� ~ +20��)
		long num2 = 10; // 8Byte, DB���� �ַ� Primary Key�� long �ڷ����� ���
		short num1 = 1; // 2Byte
		
		// ����
		char s = 'A'; // 2Byte(����, �ѱ�) �߱���:3Byte
		
		// �Ǽ�
		double d = 7.5; // 8Byte 42�� 9õ(-20�� ~ +20��) �߰� �Ҽ��� ����
		
		// ��, ����
		boolean b = true; // 1bit
		
		num = (int)d; // ����� ����ȯ (�ٿ� ĳ���� - �ڷ� ����)
		
		// num = num2; // ����� ����ȯ�� �ʿ�(�̹� �Ҵ�Ǿ��ִ� 8Byte�� 4Byte�� �־���ϱ� ����.
		num = (int)num2; // ����� ����ȯ(�ٿ� ĳ����)
		
		num2 = num; // ����� ����ȯ (�� ĳ����)

	} // end of main

}
