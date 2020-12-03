package ch07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Hash02 {
	public static void main(String[] args) {
		// 랜덤으로 숫자를 생성해주는 클래스
		Random r = new Random();
		// Set에는 중복값이 담기지 않는다.
		// HashSet<>(숫자) : HashSet의 크기 지정
		Set<Integer> lotto = new HashSet<>(6);
		
		while (true) {
			int num = r.nextInt(45) + 1;
			
			lotto.add(num);
			
			if (lotto.size() == 6) {
				break;
			}
		}
		
		Iterator<Integer> it = lotto.iterator();
		
		while(it.hasNext()) { // 값이 있으면 true, 없으면 false
			System.out.print(it.next() + " "); // 현재 인덱스의 값을 리턴 + 인덱스 증가
		}
		
	}
}
