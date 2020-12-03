package ch03;

public class Array01 {

	public static void main(String[] args) {
		// 같은 종류의 데이터들이 순차적으로 저장된다.
		// 장점 : 액세스가 빠르다.
		// 단점 : 배열의 크기를 늘리거나 줄일 수 없다.
		int[] num = new int[3]; // 배열의 기본 형태
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		num[0] = 50;
		System.out.println("num의 0번지 : " + num[0]);
		
//		ArrayIndexOutOfExcepteion
//		num[3] = 10; // 런타임 에러 발생
	}

}
