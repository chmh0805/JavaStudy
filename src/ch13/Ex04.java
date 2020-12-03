package ch13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Timer1 implements Runnable {
	private JLabel laTimer;
	
	public Timer1(JLabel laTimer) {
		this.laTimer = laTimer;
	}

	@Override
	public void run() {
		int n = 0;
		
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

public class Ex04 extends JFrame {
	private Container c;
	private JLabel laTimer;
	private JButton btnStop;
	
	void initObject() {
		c = getContentPane();
		laTimer = new JLabel("1");
		btnStop = new JButton("kill Timer");
	}
	
	public Ex04() {
		initObject();
		
		setTitle("ThreadInterrupt ¿¹Á¦");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		c.setLayout(new FlowLayout());
		c.add(laTimer);
		c.add(btnStop);
		
		laTimer.setFont(new Font("CookieRun", Font.ITALIC, 80));
		
		Thread t1 = new Thread(new Timer1(laTimer));
		t1.start();
		
		btnStop.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				t1.interrupt();
				btnStop.setEnabled(false);
			}
		});
		
		setSize(300, 180);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex04();
	}
}
