package ch12;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex09 extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public Ex09() {
		setTitle("패널에 꽉 차도록 두 이미지 파일 그리기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		private ImageIcon icon1, icon2;
		private Image img1, img2;
		
		public MyPanel() {
			icon1 = new ImageIcon("images/explore4.jpg");
			icon2 = new ImageIcon("images/home__article__header-img-1.png");
			img1 = icon1.getImage();
			img2 = icon2.getImage();
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawImage(img1, 0, 0, getWidth(), getHeight()/2, this);
			g.drawImage(img2, 0, getHeight()/2, getWidth(), getHeight()/2, this);
		}
	}
	
	public static void main(String[] args) {
		new Ex09();
	}
}
