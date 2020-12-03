package ch11;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ex08 extends JFrame {
	public Ex08() {
		Container c = getContentPane();
		JLabel laName = new JLabel("이름");
		JLabel laClass = new JLabel("학과");
		JLabel laAdress = new JLabel("주소");
		JTextField tfName = new JTextField(20);
		JTextField tfClass = new JTextField(20);
		JTextField tfAdress = new JTextField(20);
		
		setTitle("텍스트필드 만들기 예제");
		setSize(300, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		c.setLayout(new GridLayout(3, 2));
		c.add(laName);
		c.add(tfName);
		c.add(laClass);
		c.add(tfClass);
		c.add(laAdress);
		c.add(tfAdress);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex08();
	}
}
