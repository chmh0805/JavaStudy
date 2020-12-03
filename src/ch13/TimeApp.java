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
		// 실시간으로
		while (true) {
			// 현재 시간 받기
			LocalDateTime now = LocalDateTime.now();
			int hour = now.getHour();
			int minute = now.getMinute();
			int second = now.getSecond();
			// 받은 시간정보를 텍스트로 변환
			String timeText = Integer.toString(hour) + ":" + Integer.toString(minute) + ":" + Integer.toString(second);
			// 텍스트 시간정보를 label에 set함
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
		setTitle("디지털 시계 만들기");
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
		// 1. 객체 생성
		initObject();
		// 2. 객체 속성 변경
		initSetting();
		// 3. 객체 배치
		initBatch();
		// 4. 현재 시간정보를 받아오는 스레드 실행
		getTime();
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TimeApp();
	}
}
