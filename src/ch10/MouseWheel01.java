package ch10;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseWheel01 extends JFrame {
	private Container c;
	private JLabel la;
	
	public MouseWheel01() {
		c = getContentPane();
		c.setLayout(new FlowLayout());
		la = new JLabel("Love Java");
		c.add(la);
		
		setSize(600, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		la.addMouseWheelListener(new MouseWheelListener() {
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				int n = e.getWheelRotation();
				if (n < 0) {
					la.setFont(new Font("CookieRun", 0, la.getFont().getSize()-5));
				} else {
					la.setFont(new Font("CookieRun", 0, la.getFont().getSize()+5));
				}
			}
		});
		
		
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public static void main(String[] args) {
		new MouseWheel01();
	}
}
