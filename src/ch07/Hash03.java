package ch07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Hash03 {
	public static void main(String[] args) {
		// 랜덤으로 숫자를 생성해주는 클래스
		Random r = new Random();
		// Set에는 중복값이 담기지 않는다.
		// HashSet<>(숫자) : HashSet의 크기 지정
		List<Integer> lotto = new ArrayList<>();
		
		// 실습 : 이전 번지에 같은 값이 있으면 중복된 데이터 넣지 않기
		while (true) {
			int num = r.nextInt(45) + 1;
			
			// 같은 값이 없을 때만 add하기
			if (lotto.indexOf(num) == -1) {
				lotto.add(num);
			}
			
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
