package ch07;

import java.util.Vector;

public class Generic03 {
	public static void main(String[] args) {
		// 동기화 되어있는 임계 구역(Critical Section) (동시접근 불가능)
		// 프로그래밍에서 동기화 : 일의 순서가 있는 것
		// DB에서 동기화 : 데이터가 일치하는 것
		Vector<Integer> list1 = new Vector<>();
		// 사용법이 ArrayList와 동일하다.
		
		list1.add(100);
		list1.add(200);
		list1.add(1, 150);
		System.out.println(list1.get(1));
	}
}
