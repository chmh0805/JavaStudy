package ch03;

public class For04 {

	static void starDown(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		for (int i = 5; i > 0; i--) {
			starDown(i);
		}

	}

}
