package ch10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Event01 extends JFrame {
	
	private JButton btn1;
	private JLabel la1;
	private int count;
	
	public Event01() {
		setTitle("�̺�Ʈ 01");
		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		btn1 = new JButton("Ŭ���ϼ���");
		la1 = new JLabel("Ŭ���ȵ�");
		la1.setFont(new Font("CookieRun", Font.BOLD, 50));
		
		// JFrame�� �⺻������ ������ �ִ� JPanel�� �����ϱ� ����
		Container c = getContentPane();
		c.add(la1, BorderLayout.CENTER);
		c.add(btn1, BorderLayout.SOUTH);
		count = 1;
		
		// 1. ������ ��� (������=�������̽�(�޼��� ������ ���ؼ�))
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				la1.setText(count + "ȸ Ŭ����");
				count = count + 1;
			}
		});
		// 2. JVM(OS)�� � �̺�Ʈ�� �߻��ߴ� �� Ȯ��
		// 3. �߻��� �̺�Ʈ�� �̺�Ʈ �й� �����忡 ��� (��⿭ ���)
		// 4. ������� ������(=�������̽�)�� �����.
		
		setVisible(true); // ������ ���� �������� !! �׸��� �׷���� ��
	}

	public static void main(String[] args) {
		new Event01();
	}
}
