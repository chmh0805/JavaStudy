package ch10;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyCodeEx extends JFrame {
	private Container c;
	private JLabel la;
	
	public KeyCodeEx() {
		c = getContentPane();
		la = new JLabel("키가 입력되지않음");
		
		c.add(la);
		
		setSize(400, 200);
		setTitle("Key Code 예제 : F1키:초록색, %키:노란색");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyChar() == '5') {
					la.setText("5키가 입력되었음");
					c.setBackground(Color.GREEN);
				}
				if (e.getKeyCode() == KeyEvent.VK_F1) {
					la.setText("F1키가 입력되었음");
					c.setBackground(Color.YELLOW);
				}
			}
		});
		
		
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	
	
	public static void main(String[] args) {
		new KeyCodeEx();
	}
}
