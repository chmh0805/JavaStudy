package coffee;

// ��
// å�� : �޴� �ֹ�, �Ա�
public class Customer {
	
	public void order(Barista b) {
		// �ٸ���Ÿ���� �޽����� ����
		Coffee c = b.makeCoffee();
		System.out.println(c.getName()+"�� ���Խ��ϴ�.");
	}
}
