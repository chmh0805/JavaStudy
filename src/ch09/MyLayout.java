package ch09;

public enum MyLayout {
	WEST("West", "����"),
	EAST("East", "����"),
	SOUTH("South", "����"),
	NORTH("North", "����"),
	CENTER("Center", "�߾�");

	private String value;
	private String value2;
	
	private MyLayout(String value, String value2) {
		this.value = value;
		this.value2 = value2;
	}
	
	public String getValue() {
		return value;
	}
	
	public String getValue2() {
		return value2;
	}
}
