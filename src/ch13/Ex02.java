package ch13;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class Timer implements Runnable {
	private JLabel laTimer;
	private int n;
	
	public Timer(JLabel laTimer) {
		this.laTimer = laTimer;
	}
	
	@Override
	public void run() {
		n = 0;
		while (true) {
			laTimer.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

public class Ex02 extends JFrame {
	private Container c;
	private JLabel laTimer;
	
	public Ex02() {
		c = getContentPane();
		laTimer = new JLabel();

		setTitle("Runnable을 구현한 타이머 스레드 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		c.add(laTimer);
		c.setLayout(new FlowLayout());
		c.setBackground(Color.YELLOW);
		laTimer.setFont(new Font("CookieRun", Font.BOLD, 80));
		laTimer.setForeground(Color.RED);
		
		Thread t1 = new Thread(new Timer(laTimer));
		
		setSize(500, 140);
		setVisible(true);
		
		t1.start();
	}
	
	public static void main(String[] args) {
		new Ex02();
	}
}
