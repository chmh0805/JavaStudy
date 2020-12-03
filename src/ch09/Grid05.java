package ch09;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Grid05 extends JFrame {
	public Grid05() {
		setSize(300, 300);
		setTitle("Random Labels");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		for (int i = 0; i < 20; i++) {
			JLabel lb = new JLabel(Integer.toString(i));
			int x = (int)Math.random()*200 + 50;
			int y = (int)Math.random()*200 + 50;
			lb.setLocation(x, y);
			lb.setSize(10, 10);
			lb.setBackground(Color.BLUE);
			lb.setOpaque(true);
			c.add(lb);
		}
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Grid05();
	}
}
