package review;

import java.util.Scanner;

interface ��ǲ {
	String �̸��ޱ�();
}

public class Ex124 {
	
	static void �λ� (��ǲ n) {
		System.out.println("�ȳ��ϼ��� " + n);
	}
	
	public static void main(String[] args) {
		�λ�(new ��ǲ() {
			@Override
			public String �̸��ޱ�() {
				Scanner sc = new Scanner(System.in);
				return sc.next();
			};
		});
	}
}
