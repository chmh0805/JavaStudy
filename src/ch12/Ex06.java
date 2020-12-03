package ch12;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex06 extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public Ex06() {
		setTitle("���� ũ��� ���ϴ� ��ġ�� �̹��� �׸���");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(300, 420);
		setVisible(true);
	}
	
	
	
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/image0.jpg");
		private Image img = icon.getImage();
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			// �̹����� �г��� (20,20)�� ���� ũ��� �׸���.
			g.drawImage(img, 20, 20, this);
		}
	}
	
	public static void main(String[] args) {
		new Ex06();
	}
}