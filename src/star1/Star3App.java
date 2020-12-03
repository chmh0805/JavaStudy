package star1;

// 1. Zealot, Dragoon, Tank, Scv, DarkTempler => StarUnit 타입
public class Star3App {

	public static void attack(StarUnit u1, StarUnit u2) {
		System.out.println(u1.getName()+" -> "+u2.getName()+" 공격");
		u2.damaged(u1.getAttack());
		System.out.println(u2.getName()+" 체력 : "+u2.getHp());
		System.out.println();
	}
	
	public static void main(String[] args) {
		// z1, d1 : stack에 뜬다.(main이 들고있는 지역변수) | new 뒤의 값 : heap에 뜬다.
				StarUnit z1 = new Zealot("질럿1", 100, 10);
				StarUnit d1 = new Dragoon("드라군1", 100, 20);
				StarUnit d2 = new Dragoon("드라군2", 100, 20);
				StarUnit dt1 = new DarkTempler("다크템플러1", 100, 40);
				StarUnit dt2 = new DarkTempler("다크템플러2", 100, 40);
				StarUnit m1 = new Marine("마린1", 40, 5);
				StarUnit s1 = new Scv("SCV1", 60, 5);
				
				// 1. 질럿1 -> 드라군1 공격
				attack(z1, d1);
				
				// 2. 드라군1 -> 질럿1 공격
				attack(d1, z1);
				
				// 3. 드라군1 -> 드라군2 공격
				attack(d1, d2);
				
				// 4. 다크템플러1 -> 질럿1 공격
				attack(dt1, z1);
				
				// 5. 다크템플러2 -> 드라군1 공격
				attack(dt2, d1);
				
				attack(dt2, s1);
				attack(m1, dt2);
	}

}
