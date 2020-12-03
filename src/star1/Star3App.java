package star1;

// 1. Zealot, Dragoon, Tank, Scv, DarkTempler => StarUnit Ÿ��
public class Star3App {

	public static void attack(StarUnit u1, StarUnit u2) {
		System.out.println(u1.getName()+" -> "+u2.getName()+" ����");
		u2.damaged(u1.getAttack());
		System.out.println(u2.getName()+" ü�� : "+u2.getHp());
		System.out.println();
	}
	
	public static void main(String[] args) {
		// z1, d1 : stack�� ���.(main�� ����ִ� ��������) | new ���� �� : heap�� ���.
				StarUnit z1 = new Zealot("����1", 100, 10);
				StarUnit d1 = new Dragoon("���1", 100, 20);
				StarUnit d2 = new Dragoon("���2", 100, 20);
				StarUnit dt1 = new DarkTempler("��ũ���÷�1", 100, 40);
				StarUnit dt2 = new DarkTempler("��ũ���÷�2", 100, 40);
				StarUnit m1 = new Marine("����1", 40, 5);
				StarUnit s1 = new Scv("SCV1", 60, 5);
				
				// 1. ����1 -> ���1 ����
				attack(z1, d1);
				
				// 2. ���1 -> ����1 ����
				attack(d1, z1);
				
				// 3. ���1 -> ���2 ����
				attack(d1, d2);
				
				// 4. ��ũ���÷�1 -> ����1 ����
				attack(dt1, z1);
				
				// 5. ��ũ���÷�2 -> ���1 ����
				attack(dt2, d1);
				
				attack(dt2, s1);
				attack(m1, dt2);
	}

}