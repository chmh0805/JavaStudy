package ch10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class TestHi extends JFrame {
	private Container c;
	private JLabel la1;
	
	public TestHi() {
		c = getContentPane();
		la1 = new JLabel("HI");
		c.add(la1, BorderLayout.CENTER);
		
		setSize(150, 150);
		setTitle("POP-UP");
		
		setVisible(true);
	}
}

public class Test extends JFrame {
	private Container c;
	private JButton btn;
	private JPanel jp1;
	private JCheckBox jcb;
	private JRadioButton jrb;
	private JCheckBoxMenuItem jcbmi;
	
	public Test() {
		c = getContentPane();
		btn = new JButton("클릭하세요");
		jp1 = new JPanel();
		jcb = new JCheckBox();
		jrb = new JRadioButton();
		jcbmi = new JCheckBoxMenuItem();
		
		c.add(jp1, BorderLayout.CENTER);
		c.add(btn, BorderLayout.SOUTH);
		jp1.add(jcb);
		jp1.add(jrb);
		jp1.add(jcbmi);
		
		setSize(300, 300);
		setTitle("Main 창");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new TestHi();
			}
		});
		
		jrb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn.setBackground(Color.CYAN);
				super.mouseEntered(e);
			}
		});
		
	}
	
	public static void main(String[] args) {
		new Test();
	}
}
