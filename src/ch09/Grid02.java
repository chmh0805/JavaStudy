package ch09;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Grid02 extends JFrame {
	
	public Grid02() {
		setSize(600, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(1, 10);
		
		Container c = getContentPane();
		c.setLayout(grid);
		c.add(new JButton("0")).setBackground(Color.red);
		c.add(new JButton("1")).setBackground(Color.orange);
		c.add(new JButton("2")).setBackground(Color.yellow);
		c.add(new JButton("3")).setBackground(Color.green);
		c.add(new JButton("4")).setBackground(Color.cyan);
		c.add(new JButton("5")).setBackground(Color.blue);
		c.add(new JButton("6")).setBackground(Color.magenta);
		c.add(new JButton("7")).setBackground(Color.DARK_GRAY);
		c.add(new JButton("8")).setBackground(Color.pink);
		c.add(new JButton("9")).setBackground(Color.gray);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Grid02();
	}
}
