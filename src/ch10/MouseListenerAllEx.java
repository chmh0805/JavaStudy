package ch10;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerAllEx extends JFrame {
	private Container c;
	private JLabel la;
	
	public MouseListenerAllEx() {
		setTitle("MouseListener¿Í MouseMotionListener ¿¹Á¦");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		c = getContentPane();
		c.setLayout(new FlowLayout());
		la = new JLabel("No Mouse Event");
		c.add(la);
		
		c.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				la.setText("Mouse Released (" + x + "," + y + ")");
			}
			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				la.setText("Mouse Pressed (" + x + "," + y + ")");
			}
			@Override
			public void mouseExited(MouseEvent e) {
				c.setBackground(Color.YELLOW);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				c.setBackground(Color.CYAN);
				la.setText("Mouse Entered");
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					int r = (int)(Math.random()*256);
					int g = (int)(Math.random()*256);
					int b = (int)(Math.random()*256);
					la.setText("Double Clicked");
					c.setBackground(new Color(r, g, b));
				} else {
					int x = e.getX();
					int y = e.getY();
					la.setText("Mouse Clicked (" + x + "," + y + ")");
				}
			}
		});
		
		c.addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseMoved(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				la.setText("Mouse Moved (" + x + "," + y + ")");
			}
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				la.setText("Mouse Dragged (" + x + "," + y + ")");
			}
		});
		
		
		
		
		setSize(300, 200);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	
	
	public static void main(String[] args) {
		new MouseListenerAllEx();
	}
}
