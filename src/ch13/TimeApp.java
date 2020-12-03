package ch13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.time.LocalDateTime;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimeNow implements Runnable {
	private JLabel laTime;
	
	public TimeNow(JLabel laTime) {
		this.laTime = laTime;
	}
	
	@Override
	public void run() {
		// �ǽð�����
		while (true) {
			// ���� �ð� �ޱ�
			LocalDateTime now = LocalDateTime.now();
			int hour = now.getHour();
			int minute = now.getMinute();
			int second = now.getSecond();
			// ���� �ð������� �ؽ�Ʈ�� ��ȯ
			String timeText = Integer.toString(hour) + ":" + Integer.toString(minute) + ":" + Integer.toString(second);
			// �ؽ�Ʈ �ð������� label�� set��
			laTime.setText(timeText);
		}
	}
}

public class TimeApp extends JFrame {
	private Container c;
	private JLabel laTime;
	
	private void initObject() {
		c = getContentPane();
		laTime = new JLabel("");
	}
	
	private void initSetting() {
		c.setLayout(new FlowLayout());
		laTime.setFont(new Font("CookieRun", Font.ITALIC, 80));
		setTitle("������ �ð� �����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 160);
	}
	
	private void initBatch() {
		c.add(laTime);
	}
	
	private void getTime() {
		Thread t1 = new Thread(new TimeNow(laTime));
		t1.start();
	}
	
	public TimeApp() {
		// 1. ��ü ����
		initObject();
		// 2. ��ü �Ӽ� ����
		initSetting();
		// 3. ��ü ��ġ
		initBatch();
		// 4. ���� �ð������� �޾ƿ��� ������ ����
		getTime();
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TimeApp();
	}
}
