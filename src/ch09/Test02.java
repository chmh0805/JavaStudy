package ch09;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test02 extends JFrame {

	public Test02() {
		setTitle("�ǽ����� 1");
		setSize(300, 400);
		
		JButton btn1 = new JButton("��ư1");
		JButton btn2 = new JButton("��ư2");
		btn2.setSize(50, 50);
		JButton btn3 = new JButton("��ư3");
		JButton btn4 = new JButton("��ư4");
		JButton btn5 = new JButton("��ư5");
		
		Container c = getContentPane();
		JPanel jp1 = new JPanel();
		jp1.setLayout(new FlowLayout());
		
		c.add(btn1, BorderLayout.NORTH);
		c.add(btn2, BorderLayout.CENTER);
		c.add(jp1, BorderLayout.SOUTH);
		jp1.add(btn3);
		jp1.add(btn4);
		jp1.add(btn5);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Test02();
	}
}
