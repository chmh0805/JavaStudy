package ch02;

public class Oper01 {

	public static void main(String[] args) {
		System.out.println(1 + 1); // 연산
		System.out.println(1 + "1"); // 결합
		System.out.println("1" + "1"); // 결합
		
		int num = 10;
		String s = "5";
		
		String sum = num + s; // 타입이 String으로 됨.
		System.out.println(sum);
		
		System.out.println(10 - 5);
		System.out.println(10 / 3); // 타입이 int으로 됨.
		System.out.println(10.0 / 3); // 타입이 double로 됨.
		// double은 8Byte, int는 4Byte이며 연산하면 8Byte인(큰) 자료형을 따라간다.
		System.out.println(10 % 3); // 나머지 구하기
		System.out.println(10 * 3);
	}

}
