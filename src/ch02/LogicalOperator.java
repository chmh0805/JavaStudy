package ch02;

public class LogicalOperator {

	public static void main(String[] args) {
		// 비교 연산
		System.out.println('a' > 'b'); // false
		System.out.println(3 >= 2); // true
		System.out.println(-1 < 0); // true
		System.out.println(3.45 <= 2); // false
		System.out.println(3 == 2); // false
		System.out.println(3 != 2); // true
		System.out.println(!(3 != 2)); // !true == false
		
		System.out.println("==================================");
		
		// 비교 연산과 논리 연산 복합
		System.out.println((3 > 2) && (3 > 4)); // true AND false == false
		System.out.println((3 != 2) || (-1 > 0)); // true OR false == true
		System.out.println((3 != 2) ^ (-1 > 0)); // true XOR false == true
		// XOR : 두 값이 서로 다를 때 true
	}

}
