package ch04;

class Cal { // 계산기
	static void add(int n1, int n2) { // 더하기
	//  함수명(매개변수)
	// 함수명 앞 void == return 값이 없다는 의미
		System.out.println(n1 + n2);
	}
	
	static int minus(int n3, int n4) {
	// 함수명 앞 int == return 값이 int 자료형이라는 의미
		return n3 - n4;
	}
}


public class Method03 {

	public static void main(String[] args) {
		// Static, Heap이 관리하는 변수 == 전역변수
		// Stack이 관리하는 변수 == 지역변수(stack이 종료될 때 사라진다.)
		Cal.add(5, 6);
		
		Cal.minus(10, 4); // == 6
		// minus 함수는 return 타입이 int이기 때문에
		// Cal.minus(10, 4)가 호출된 후 메서드가 종료되면
		// Cal.minus(10, 4) -----> 6으로 변경된다.
		int result = Cal.minus(10, 4);
		System.out.println(result);
	}

}
