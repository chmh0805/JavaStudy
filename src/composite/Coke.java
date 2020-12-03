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
		System.out.println(desc + "�� ����������ϴ�.");
	}
	
	public Coke() {
		this(1000, "��ī�ݶ�");
	}

}