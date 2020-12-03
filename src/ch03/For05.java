package ch03;

public class For05 {

	static void starWave(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int n1 = 12;
		
		for (int j = 1; j < n1; j++) {
			if (j >= n1-j) {
				starWave(n1-j);
			} else {
				starWave(j);
			}
		}
		
	}

}
