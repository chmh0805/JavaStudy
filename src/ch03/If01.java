package ch03;

public class If01 {

	public static void main(String[] args) {
		
		// 표현식(expression)
		if(true) {
			System.out.println("true 입니다.");
		}
		
		if(false) {
			System.out.println("실행안됨(dead code)");
		}
		
		int num = 5;
		
		if(num >= 1) {
			System.out.println("num은 1보다 큽니다.");
		} else { // 위의 조건식이 false라면 아래를 실행
			System.out.println("num은 1보다 작습니다.");
		}
		
		int sum = 20;
		
		if (sum == 10) {
			System.out.println("sum은 10입니다.");
		} else if (sum == 20) { // 위의 조건식이 false라면 해당 조건식을 확인
			System.out.println("sum은 20입니다.");
		} else {
			System.out.println("sum은 30입니다.");
		}
		
	}

}
