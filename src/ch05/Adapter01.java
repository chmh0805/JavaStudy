package ch05;

interface Knife {
	void �丮();
	void ����();
}

// ����� �뵵 : interface�� �ɷ����� �뵵
abstract class �丮��Adapter implements Knife {
	public void ����() {}
}

class ������ extends �丮��Adapter {
	@Override
	public void �丮() {
		
	}
}

public class Adapter01 {
	public static void main(String[] args) {
		
	}
}
