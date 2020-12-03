package ch11;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex01 extends JFrame {
	public Ex01() {
		super("JComponent의 공통 메서드 예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("Magenta/Yellow Button");
		JButton btn2 = new JButton("	Disabled Button	");
		JButton btn3 = new JButton("getX(), getY()");
		
		btn1.setBackground(Color.YELLOW);
		btn1.setForeground(Color.MAGENTA);
		btn1.setFont(new Font("Arial", Font.ITALIC, 20));
		btn2.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				Ex01 frame = (Ex01)b.getTopLevelAncestor();
				frame.setTitle(b.getX() + "," + b.getY());
			}
		});
		
		c.add(btn1); c.add(btn2); c.add(btn3);
		
		setSize(260, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
}
