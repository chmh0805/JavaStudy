package ch10;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class OpenChallenge10 extends JFrame {
	private Container c;
	private JLabel la1, la2, la3, laPrint;
	private int n1, n2, n3;

	private int changeNum(int n) {
		int x = (int)(Math.random()*n);
		return x;
	}
	
	private void initObject() {
		c = getContentPane();
		c.setLayout(null);
		la1 = new JLabel(n1+"");
		la2 = new JLabel(n2+"");
		la3 = new JLabel(n3+"");
		laPrint = new JLabel("시작합니다.");
		n1 = 0;
		n2 = 0;
		n3 = 0;
	}
	
	private void initSetting() {
		la1.setSize(70, 40);
		la1.setBackground(Color.DARK_GRAY);
		la1.setOpaque(true);
		la1.setLocation(30, 60);
		la1.setFont(new Font("CookieRun", Font.BOLD, 30));
		la1.setHorizontalAlignment(la1.CENTER);
		la1.setForeground(Color.MAGENTA);
		
		la2.setSize(70, 40);
		la2.setBackground(Color.DARK_GRAY);
		la2.setOpaque(true);
		la2.setLocation(135, 60);
		la2.setFont(new Font("CookieRun", Font.BOLD, 30));
		la2.setHorizontalAlignment(la2.CENTER);
		la2.setForeground(Color.MAGENTA);

		la3.setSize(70, 40);
		la3.setBackground(Color.DARK_GRAY);
		la3.setOpaque(true);
		la3.setLocation(240, 60);
		la3.setFont(new Font("CookieRun", Font.BOLD, 30));
		la3.setHorizontalAlignment(la3.CENTER);
		la3.setForeground(Color.MAGENTA);
		
		laPrint.setSize(150, 50);
		laPrint.setLocation(85, 130);
		laPrint.setFont(new Font("CookieRun", Font.BOLD, 18));
		laPrint.setHorizontalAlignment(laPrint.CENTER);
		
		setTitle("Open Challenge 10");
		setSize(340, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void initBatch() {
		c.add(la1);
		c.add(la2);
		c.add(la3);
		c.add(laPrint);
	}
	
	public OpenChallenge10() {
		initObject();
		
		initSetting();
		
		initBatch();
		
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					n1 = changeNum(5);
					n2 = changeNum(5);
					n3 = changeNum(5);
					la1.setText(Integer.toString(n1));
					la2.setText(Integer.toString(n2));
					la3.setText(Integer.toString(n3));
					System.out.println(la1.getText());
					System.out.println(la2.getText());
					System.out.println(la3.getText());
				}
				
				if ((n1 == n2) && (n2 == n3)) {
					laPrint.setText("축하합니다!!");
				} else {
					laPrint.setText("아쉽군요");
				}
			}
		});
		
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				c.setFocusable(true);
				c.requestFocus();
			}
		});
		
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public static void main(String[] args) {
		new OpenChallenge10();
	}
}
