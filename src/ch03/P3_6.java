package ch03;

import java.util.Scanner;

public class P3_6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1~99 ������ ������ �Է��Ͻÿ�>>");
		int user = sc.nextInt();
		sc.close();
		String result = "�ڼ�";
		
		if ((1 <= user) && (user <= 99) && (user % 10) % 3 == 0) {
			if ((user / 10) % 3 == 0) {
				result += "¦";
			}
		result += "¦";
		System.out.println(result);
		}
		
	}

}
