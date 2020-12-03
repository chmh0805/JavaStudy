package composite;

import lombok.Data;

@Data
public class Coke {
	private int price;
	private String desc;

	public Coke(int price, String desc) {
		super();
		this.price = price;
		this.desc = desc;
		System.out.println(desc + "가 만들어졌습니다.");
	}
	
	public Coke() {
		this(1000, "코카콜라");
	}

}