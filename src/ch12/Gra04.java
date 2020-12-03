package ch12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gra04 extends JFrame {
	private Container c;
	private ArrayList<Integer> scoreList;
	private ArrayList<Color> colorList;
	private MyPanel panel;
	private JButton btn;
	private int i = 0;
	private int x = 10;
	private int width = 20;
	
	public Gra04() {
		scoreList = new ArrayList<>();
		scoreList.add(0); scoreList.add(100); scoreList.add(90); scoreList.add(65); scoreList.add(80); scoreList.add(30);
		
		colorList = new ArrayList<>();
		colorList.add(Color.RED); colorList.add(Color.RED); colorList.add(Color.BLUE); colorList.add(Color.GREEN); colorList.add(Color.ORANGE); colorList.add(Color.MAGENTA);
		
		setTitle("2번 예제");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		c = getContentPane();
		
		panel = new MyPanel();
		btn = new JButton("클릭");
		c.add(panel, BorderLayout.CENTER);
		c.add(btn, BorderLayout.SOUTH);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.paintComponent(getGraphics());
			}
		});
		
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			g.setColor(colorList.get(i));
			int height = scoreList.get(i);
			int y = 232 - height;
			g.fillRect(x, y, width, height);
			i = i + 1;
			x = x + 40;
		}
	}

	public static void main(String[] args) {
		new Gra04();
	}
}
