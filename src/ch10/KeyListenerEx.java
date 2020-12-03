package ch10;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenerEx extends JFrame {
	private JLabel[] keyMessage;
	private Container c;
	
	public KeyListenerEx() {
		setTitle("Key Listener 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new MyKeyListener());
		
		keyMessage = new JLabel[3];
		keyMessage[0] = new JLabel(" getKeyCode() ");
		keyMessage[1] = new JLabel(" getKeyChar() ");
		keyMessage[2] = new JLabel(" getKeyText() ");
		
		for (int i=0; i<keyMessage.length; i++) {
			c.add(keyMessage[i]);
			keyMessage[i].setOpaque(true); // 배경색이 보이도록 불투명 속성 설정
			keyMessage[i].setBackground(Color.YELLOW);
		}
		
		setSize(300, 150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			char keyChar = e.getKeyChar();
			keyMessage[0].setText(Integer.toString(keyCode));
			keyMessage[1].setText(Character.toString(keyChar));
			keyMessage[2].setText(KeyEvent.getKeyText(keyCode));
			
			System.out.println("KeyPressed");
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("KeyReleased");
		}
		
		@Override
		public void keyTyped(KeyEvent e) {
			System.out.println("KeyTyped");
		}
	}
	
	public static void main(String[] args) {
		new KeyListenerEx();
	}
}
