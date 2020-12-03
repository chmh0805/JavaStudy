package ch09;

public enum MyLayout {
	WEST("West", "辑率"),
	EAST("East", "悼率"),
	SOUTH("South", "巢率"),
	NORTH("North", "合率"),
	CENTER("Center", "吝居");

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
