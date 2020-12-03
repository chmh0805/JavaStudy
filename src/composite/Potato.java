package composite;

import lombok.Data;

@Data
public class Potato {
	private int price;
	private String desc;

	public Potato(int price, String desc) {
		super();
		this.price = price;
		this.desc = desc;
		System.out.println(desc + "�� ����������ϴ�.");
	}
	
	public Potato() {
		this(1000, "����Ƣ��");
	}

}