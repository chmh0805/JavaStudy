package ch02;

//자바는 .class 파일을 실행하면 static 부분을 메모리에 로드한다.
//static 공간에 있는 main()함수를 찾아서 호출하고
//이 때 stack이 생성되는데 이 stack의 이름은 main이라고 한다.
//main이 stack 종료되면 프로그램 종료 !!
public class Var02 {

	public static void main(String[] args) {
		// Code 부분
		// 숫자
		int num = 10; // 4Byte - 32bit - 42억 9천 경우의 수(대략 -20억 ~ +20억)
		long num2 = 10; // 8Byte, DB에서 주로 Primary Key를 long 자료형을 사용
		short num1 = 1; // 2Byte
		
		// 문자
		char s = 'A'; // 2Byte(영어, 한글) 중국어:3Byte
		
		// 실수
		double d = 7.5; // 8Byte 42억 9천(-20억 ~ +20억) 추가 소수점 이하
		
		// 참, 거짓
		boolean b = true; // 1bit
		
		num = (int)d; // 명시적 형변환 (다운 캐스팅 - 자료 유실)
		
		// num = num2; // 명시적 형변환이 필요(이미 할당되어있는 8Byte를 4Byte에 넣어야하기 때문.
		num = (int)num2; // 명시적 형변환(다운 캐스팅)
		
		num2 = num; // 목시적 형변환 (업 캐스팅)

	} // end of main

}
