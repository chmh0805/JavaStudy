package ch13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerThread extends Thread {
	private JLabel timerLabel;
	
	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	
	@Override
	public void run() {
		int n = 0;
		
		while (true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

public class Ex01 extends JFrame{
	public Ex01() {
		setTitle("Thread를 상속받은 타이머 스레드 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// 타이머 값을 출력할 레이블 생성
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("CookieRun", Font.ITALIC, 80));
		c.add(timerLabel);
		
		Thread th = new Thread(new TimerThread(timerLabel));
		
		setSize(300, 170);
		setVisible(true);
		
		th.start();
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
}
