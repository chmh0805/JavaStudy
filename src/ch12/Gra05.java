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

public class Gra05 extends JFrame {
	private ArrayList<Integer> scoreList;
	private ArrayList<Color> colorList;
	private MyPanel panel;
	private JButton btn;
	private int width = 20;
	
	public Gra05() {
		scoreList = new ArrayList<>();
		scoreList.add(0); scoreList.add(100); scoreList.add(90); scoreList.add(65); scoreList.add(80); scoreList.add(30);
		
		colorList = new ArrayList<>();
		colorList.add(Color.RED); colorList.add(Color.RED); colorList.add(Color.BLUE); colorList.add(Color.GREEN); colorList.add(Color.ORANGE); colorList.add(Color.MAGENTA);
		
		panel = new MyPanel();
		btn = new JButton("클릭");

		setTitle("3번 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(panel);
		
		panel.setLayout(new BorderLayout());
		panel.add(btn, BorderLayout.SOUTH);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.repaint();
			}
		});
		
		setSize(300, 300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			g.setColor(colorList.get(0));
			int height = scoreList.get(0);
			int x = 20;
			int y = 232 - height;
			g.fillRect(x, y, width, height);
		}
	}
	
	public static void main(String[] args) {
		new Gra05();
	}
}
