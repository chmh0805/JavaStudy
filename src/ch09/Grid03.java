package ch09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Grid03 extends JFrame {
	
	public Grid03() {
		setSize(300, 300);
		setTitle("Open Challenge 9");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		jp1.setBackground(Color.lightGray);
		jp2.setLayout(null);
		c.add(jp1, BorderLayout.NORTH);
		c.add(jp2, BorderLayout.CENTER);
		jp1.add(new JButton("Open"));
		jp1.add(new JButton("Read"));
		jp1.add(new JButton("Close"));
		
		JLabel jb1 = new JLabel("Hello");
		JLabel jb2 = new JLabel("Java");
		JLabel jb3 = new JLabel("Love");
		
		jb1.setSize(30, 30);
		jb1.setLocation(100, 10);
		
		jb2.setSize(30, 30);
		jb2.setLocation(20, 150);
		
		jb3.setSize(30, 30);
		jb3.setLocation(200, 130);
		
		jp2.add(jb1);
		jp2.add(jb2);
		jp2.add(jb3);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Grid03();
	}
}
