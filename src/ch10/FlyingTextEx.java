package ch10;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlyingTextEx extends JFrame {
	private Container c;
	private JLabel la;
	int FLYING_SPEED = 10;
	
	private void initObject() {
		c = getContentPane();
		la = new JLabel("HELLO");
		la.setLocation(50, 50);
		la.setSize(100, 20);
		c.setLayout(null);
		c.add(la);
	}
		
	public FlyingTextEx() {
		initObject();
		
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_UP) {
					la.setLocation(la.getX(), la.getY()-FLYING_SPEED);
				}
				if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					la.setLocation(la.getX(), la.getY()+FLYING_SPEED);
				}
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					la.setLocation(la.getX()-FLYING_SPEED, la.getY());
				}
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					la.setLocation(la.getX()+FLYING_SPEED, la.getY());
				}
			}
		});
		
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Component com = (Component)e.getSource();
				com.setFocusable(true);
				com.requestFocus();
			}
		});
		
		setSize(300, 300);
		setTitle("상,하,좌,우 키를 이용하여 텍스트 움직이기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public static void main(String[] args) {
		new FlyingTextEx();
	}
}
