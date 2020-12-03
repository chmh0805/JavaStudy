package star1;

class River implements StarUnit {
	
	String name;
	int hp;
	int attack;
	
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public int getAttack() {
		return this.attack;
	}

	@Override
	public int getHp() {
		return this.hp;
	}
	
	@Override
	public void damaged(int atk) {
		this.hp = this.hp - atk; 
	}
	
	public River() {
		name = "다크템플러";
		hp = 100;
		attack = 10;
	}
	
	public River(String n, int h, int a) {
		name = n;
		hp = h;
		attack = a;
	}
}
