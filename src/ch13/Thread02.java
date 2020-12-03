package ch13;

class NewThread extends Thread {
	@Override
	public void run() {
		System.out.println("새로운 스레드");
	}
}

public class Thread02 {
	public static void main(String[] args) {
		// 1. 스레드 객체 생성 2. 타겟 설정 3. 실행
		Thread t1 = new Thread(new NewThread());
		t1.start();
		
		// t2 자체가 타겟
		NewThread t2 = new NewThread();
		t2.start();
	}
}
