package ch12;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Q01 extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public Q01() {
		setTitle("이미지 그리기 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/back.jpg");
		private Image img = icon.getImage();
		private JButton btn = new JButton("Hide/Show");
		private boolean showFlag = true;
		
		public MyPanel() {
			setLayout(new FlowLayout());
			add(btn);
			
			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					showFlag = !showFlag; // true와 false의 토글
					MyPanel.this.repaint(); 
					// repaint()는 다시 paintComponent()가 호출되게 하여, 
					// showFlag가 true이면 그리고 false이면 그리지 않도록 함
				}
			});
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			if (showFlag) {
				g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			}
		}
	}
	
	public static void main(String[] args) {
		new Q01();
	}
}
