package ch11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Ex04 extends JFrame {
	private Container c;
	private JCheckBox jcb1, jcb2, jcb3;
	private ImageIcon cherryIcon, selectedCherryIcon;
	
	private void initObject() {
		c = getContentPane();
		cherryIcon = new ImageIcon("images/cherry.jpg");
		selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg");
		
		jcb1 = new JCheckBox("���");
		jcb2 = new JCheckBox("��", true);
		jcb3 = new JCheckBox("ü��", cherryIcon);
	}
	
	private void initSetting() {
		c.setLayout(new FlowLayout());
		jcb3.setSelectedIcon(selectedCherryIcon);
		jcb3.setBorderPainted(true);
		setTitle("üũ�ڽ� ����� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(250, 150);
	}
	
	private void initBatch() {
		c.add(jcb1);
		c.add(jcb2);
		c.add(jcb3);
	}
	
	public Ex04() {
		initObject();
		
		initSetting();
		
		initBatch();
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex04();
	}

}
