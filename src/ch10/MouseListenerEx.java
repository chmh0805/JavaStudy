package ch10;

import java.awt.Container;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerEx extends JFrame {
	private JLabel la;
	private Container c;
	
	public MouseListenerEx() {
		la = new JLabel("Hello");
		c = getContentPane();
		c.setLayout(null);
		
		c.add(la);
		la.setSize(30, 30);
		la.setLocation(50, 50);
		
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				la.setLocation(x, y);
			}
		});
		
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_UP) {
					la.setLocation(la.getX(), la.getY()-10);
				}
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					la.setLocation(la.getX()-10, la.getY());
				}
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					la.setLocation(la.getX()+10, la.getY());
				}
				if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					la.setLocation(la.getX(), la.getY()+10);
				}
				if (e.getKeyChar() == 'q') {
					System.exit(0);
				}
			}
		});
		
		setSize(350, 350);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public static void main(String[] args) {
		new MouseListenerEx();
	}
}
