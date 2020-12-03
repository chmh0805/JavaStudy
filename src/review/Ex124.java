package review;

import java.util.Scanner;

interface 인풋 {
	String 이름받기();
}

public class Ex124 {
	
	static void 인사 (인풋 n) {
		System.out.println("안녕하세요 " + n);
	}
	
	public static void main(String[] args) {
		인사(new 인풋() {
			@Override
			public String 이름받기() {
				Scanner sc = new Scanner(System.in);
				return sc.next();
			};
		});
	}
}
