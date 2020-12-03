package composite;

public class ShrimpBurger extends Burger {
	
	public ShrimpBurger() {
		this(3000, "�������");
	}
	
	public ShrimpBurger(int price, String desc) {
		super(price, desc);
	}
}
