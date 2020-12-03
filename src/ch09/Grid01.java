package ch09;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Grid01 extends JFrame {

	public Grid01() {
		setTitle("GridLayout Sample");
		// X��ư Ŭ���ϸ� main�� �����.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 4x2 ������ GridLayout ��ġ������ ����
		GridLayout grid = new GridLayout(4, 2);
		grid.setVgap(5); // ���� ������ ���� ������ 5 �ȼ��� ����
		
		Container c = getContentPane();
		JPanel jp1 = new JPanel();
		jp1.setLayout(grid); // grid�� ����Ʈ���� ��ġ�����ڷ� ����
		JPanel jp2 = new JPanel();
		c.add(jp1, BorderLayout.CENTER);
		c.add(jp2, BorderLayout.SOUTH);
		jp2.setLayout(new BorderLayout());
		
		jp1.add(new JLabel(" �̸�"));
		jp1.add(new JTextField(""));
		jp1.add(new JLabel(" �й�"));
		jp1.add(new JTextField(""));
		jp1.add(new JLabel(" �а�"));
		jp1.add(new JTextField(""));
		jp1.add(new JLabel(" ����"));
		jp1.add(new JTextField(""));
		jp2.add(new JButton("�Է�"));
		
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Grid01();
	}

}
