package ch04;

class Television {
	
	int size;
	String mf;
	
	public Television() {
		this(32, "LG");
	}
	
	public Television(String mf) {
		this(32, mf);
	}
	
	public Television(int size, String mf) {
		this.size = size;
		this.mf = mf;
		System.out.println(size + "ÀÎÄ¡ " + mf);
	}
	
}

public class TVApp {

	public static void main(String[] args) {

		new Television();
		new Television("»ï¼º");
		new Television(65, "»ï¼º");

	}

}
