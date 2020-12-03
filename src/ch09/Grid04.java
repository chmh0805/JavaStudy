package ch09;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Grid04 extends JFrame {
	public Grid04() {
		setTitle("Ten Color Buttons Frame");
		setSize(600, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		GridLayout grid = new GridLayout(1, 10);
		c.setLayout(grid);
		
		for (int i = 0; i < 10; i++) {
			c.add(new JButton(Integer.toString(i)));
		}
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Grid04();
	}
}
