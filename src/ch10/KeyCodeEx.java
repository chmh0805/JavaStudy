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
		la = new JLabel("Ű�� �Էµ�������");
		
		c.add(la);
		
		setSize(400, 200);
		setTitle("Key Code ���� : F1Ű:�ʷϻ�, %Ű:�����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyChar() == '5') {
					la.setText("5Ű�� �ԷµǾ���");
					c.setBackground(Color.GREEN);
				}
				if (e.getKeyCode() == KeyEvent.VK_F1) {
					la.setText("F1Ű�� �ԷµǾ���");
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
