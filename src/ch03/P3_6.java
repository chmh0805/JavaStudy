package ch03;

import java.util.Scanner;

public class P3_6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1~99 사이의 정수를 입력하시오>>");
		int user = sc.nextInt();
		sc.close();
		String result = "박수";
		
		if ((1 <= user) && (user <= 99) && (user % 10) % 3 == 0) {
			if ((user / 10) % 3 == 0) {
				result += "짝";
			}
		result += "짝";
		System.out.println(result);
		}
		
	}

}
