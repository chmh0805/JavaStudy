package star1;

class Zealot implements StarUnit {
	
	private String name;
	private int hp;
	private int attack;
	
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
	
	public Zealot() {
		name = "Áú·µ";
		hp = 100;
		attack = 10;
	}
	
	public Zealot(String n, int h, int a) {
		name = n;
		hp = h;
		attack = a;
	}
}
