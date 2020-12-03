package ch11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Ex06 extends JFrame {
	public Ex06() {
		setTitle("라디오버튼 만들기 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
		ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg");
		
		ButtonGroup g = new ButtonGroup();
		
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배");
		JRadioButton cherry = new JRadioButton("체리", cherryIcon);
		
		cherry.setSelectedIcon(selectedCherryIcon);
		cherry.setBorderPainted(true);
		
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(250, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex06();
	}
}
