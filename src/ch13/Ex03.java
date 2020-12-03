package ch13;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

class FlickeringLabel extends JLabel implements Runnable {
	private long delay; // 배경색이 바뀌는 지연 시간, 밀리초단위
	
	public FlickeringLabel(String text, long delay) { // 생성자
		super(text); // JLabel 생성자 호출
		this.delay = delay;
		setOpaque(true); // 배경색 변경이 가능하도록 설정
		
		// Thread의 생성자(타겟)에 this를 넘기는 것은 이 클래스가
		// Runnable을 상속받아 run을 구현한 객체임을 표시한다.
		Thread th = new Thread(this);
		th.start();
	}
	
	@Override
	public void run() {
		int n = 0;
		while (true) {
			if (n == 0) {
				setBackground(Color.YELLOW);
			} else {
				setBackground(Color.GREEN);
			}
			
			if (n == 0) {
				n = 1;
			} else {
				n = 0;
			}
			
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
	
}

public class Ex03 extends JFrame {
	public Ex03() {
		setTitle("FlickeringLabel 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		FlickeringLabel fLa1 = new FlickeringLabel("깜박", 500); // 0.5초
		
		JLabel la = new JLabel("안깜박");
		
		FlickeringLabel fLa2 = new FlickeringLabel("여기도 깜빡", 30);
		
		c.add(fLa1);
		c.add(la);
		c.add(fLa2);
		
		setSize(300, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex03();
	}
}
