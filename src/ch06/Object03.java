package ch06;

public class Object03 {
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = "홍길동";

		int num1 = 10;
		int num2 = 10;

		// ==은 최초 액세스한 메모리 공간의 내용을 비교한다.
		// String은 주소값을 가리키는 reference이기 때문에 주소값을 비교하게 되고,
		// int는 값을 담고있기 때문에 값을 비교한다.
		System.out.println(str1 == str2);
		System.out.println(num1 == num2);

		// String의 hashCode 함수는 오버라이딩 되어서
		// 같은 문자열이면 같은 해쉬를 뽑아낸다.

		String str3 = "임꺽정"; // Heap 내부의 Constant Pool
		String str4 = new String("임꺽정"); // Heap

		// 위의 두 값은 실제로는 다른 주소값을 가진다 !
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());

		// == 으로 먼저 비교 같으면 true
		// == 으로 비교했는데 false가 나오면 최종목적지 값을 비교 		
		System.out.println(str3==str4); // false
		System.out.println(str3.equals(str4));
	}
	
}
