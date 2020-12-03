package ch10;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Event02 extends JFrame implements ActionListener {
	
	private JLabel laTitle;
	private JButton btn1, btn2, btn3;
	private Container c;
	
	public Event02() {
		laTitle = new JLabel("사과");
		btn1 = new JButton("딸기 클릭");
		btn2 = new JButton("바나나 클릭");
		btn3 = new JButton("참외 클릭");
		c = getContentPane();
		
		c.add(laTitle, BorderLayout.NORTH);
		c.add(btn1, BorderLayout.WEST);
		c.add(btn2, BorderLayout.CENTER);
		c.add(btn3, BorderLayout.EAST);
		
		// 익명클래스를 이용해서 구현하세요.
		btn1.addActionListener(this);
		
		btn2.addActionListener(this);
		
		btn3.addActionListener(this);

		setTitle("이벤트 02");
		setSize(400, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// getSource의 리턴타입은 Object
		JButton btn = (JButton)e.getSource();
		String text = btn.getText();
		if (text.equals("딸기 클릭")) {
			laTitle.setText("딸기");
		} else if (text.equals("바나나 클릭")) {
			laTitle.setText("바나나");
		} else if (text.equals("참외 클릭")) {
			laTitle.setText("참외");
		}
	}
	
	public static void main(String[] args) {
		new Event02();
	}

}
