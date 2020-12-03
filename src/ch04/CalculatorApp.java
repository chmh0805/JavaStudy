package ch04;

//숫자 10, 5 를 더해서!!
//그 결과값과 숫자 20을 곱해서
//그 결과값을 숫자 5로 나누고
//그 결과값에 100을 뺀 값을 화면에 출력하시오.
public class CalculatorApp {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		
		int answer = c1.add(10, 5);
		answer = c1.multi(answer, 20);
		answer = c1.divide(answer, 5);
		answer = c1.minus(answer, 100);
		System.out.println(answer);
		
	}

}
