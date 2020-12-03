package ch04;

class TV {
	private String manufacturer;
	private int year;
	private int inch;
	
	public TV(String m, int y, int i) {
		this.manufacturer = m;
		this.year = y;
		this.inch = i;
	}
	
	public TV() {}
	
	public void show() {
		System.out.println(manufacturer+"에서 만든 "+year+"년형 "+inch+"인치 TV");
	}
}

public class P4_1 {

	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();

	}

}
