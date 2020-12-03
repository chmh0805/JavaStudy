package star1;

class DarkTempler implements StarUnit {
	
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
	
	public DarkTempler() {
		name = "다크템플러";
		hp = 100;
		attack = 10;
	}
	
	public DarkTempler(String n, int h, int a) {
		name = n;
		hp = h;
		attack = a;
	}
}
