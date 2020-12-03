package sms;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SmsApp extends JFrame {
	private JLabel la1, la2;
	private JTextField jt1, jt2;
	private JButton btn;
	private Container c;
	private GridLayout grid;
	private JPanel jp1, jp2;
	
	public SmsApp() {
		la1 = new JLabel("받는 사람 전화번호 : ");
		la2 = new JLabel("보낼 내용 : ");
		btn = new JButton("발송");
		jt1 = new JTextField("");
		jt2 = new JTextField("");
		jp1 = new JPanel();
		jp2 = new JPanel();
		c = getContentPane();
		c.add(jp1, BorderLayout.CENTER);
		c.add(jp2, BorderLayout.SOUTH);
		
		grid = new GridLayout(2, 2);
		grid.setVgap(5);
		jp1.setLayout(grid);
		jp1.add(la1);
		jp1.add(jt1);
		jp1.add(la2);
		jp1.add(jt2);
		
		jp2.setLayout(new BorderLayout());
		jp2.add(btn);
		
		setSize(300, 400);
		setTitle("SMS 보내기 앱");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String to = jt1.getText();
				String text = jt2.getText();
				Sms01.문자발송(to, text);
			}
		});
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SmsApp();
	}
}
