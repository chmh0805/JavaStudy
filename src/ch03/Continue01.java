package ch03;

import java.util.Scanner;

public class Continue01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 5개 입력하세요.");
		int sum = 0;
		
		for (int i=0; i<5; i++) { // 5번 회전
			int n = sc.nextInt(); // 키보드에서 정수 입력
			
			if (n <= 0) { // 음수이거나 0이면
				continue; // 즉시 다음 반복문으로 넘어가는 명령어
//				break; // 제일 인접한 for문을 벗어남
			} else {
				sum = sum + n;
			}
			System.out.println("양수"); // continue가 실행되면 해당 줄이 실행되지 않는다.
		} // end of for
			
		System.out.println("양수의 합은 " + sum);
		
		sc.close(); // scanner를 닫아준다.
		
	}

}
