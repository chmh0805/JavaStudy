package ch09;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

public class Swing04 extends JFrame {

	private Container body;
	private JPanel header, main;
	private JButton btnOpen, btnRead, btnClose;
	private JLabel lbHello, lbJava, lbLove;

	void initObject() {
		body = getContentPane();

		header = new JPanel();
		main = new JPanel();

		btnOpen = new JButton("Open");
		btnRead = new JButton("Read");
		btnClose = new JButton("Close");

		lbHello = new JLabel("Hello");
		lbJava = new JLabel("Java");
		lbLove = new JLabel("Love");
	}

	void initSetting() {
		setTitle("Open Challenge 9");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		header.setBackground(Color.LIGHT_GRAY);
		main.setLayout(null);

		lbHello.setBounds(98, 10, 57, 15);
		lbJava.setBounds(12, 146, 57, 15);
		lbLove.setBounds(215, 112, 57, 15);
	}
	
	void initBatch() {
		body.add(header, BorderLayout.NORTH);
		body.add(main, BorderLayout.CENTER);

		header.add(btnOpen);
		header.add(btnRead);
		header.add(btnClose);

		main.add(lbHello);
		main.add(lbJava);
		main.add(lbLove);
	}

	public Swing04() {
		// 1. 필요한 오브젝트를 메모리에 로딩
		initObject();

		// 2. 세팅
		initSetting();

		// 3. 배치
		initBatch();

		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Swing04();
	}
}