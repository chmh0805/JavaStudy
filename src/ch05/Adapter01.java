package ch05;

interface Knife {
	void 요리();
	void 상해();
}

// 어댑터 용도 : interface를 걸러내는 용도
abstract class 요리사Adapter implements Knife {
	public void 상해() {}
}

class 백종원 extends 요리사Adapter {
	@Override
	public void 요리() {
		
	}
}

public class Adapter01 {
	public static void main(String[] args) {
		
	}
}
