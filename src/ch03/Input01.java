package ch03;

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {
		// Scanner를 이용하면 I/O 장치에 접근 가능 !!
		// class파일 실행 시 static 탐색 -> main함수 실행
		// main함수 실행 시에 "main"이라는 이름을 가진 thread가 생성되고 실행된다.
		// 이 thread는 main stack이 종료되는 시점에 종료된다.
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // 블락킹
		
		System.out.println("입력받은 값 : "+num);
		sc.close();
	}

}
