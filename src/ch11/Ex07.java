package ch11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class Ex07 extends JFrame {
	private Container c;
	private JPanel jpButton;
	private JLabel laImage;
	private JRadioButton apple, pear, cherry;
	private ButtonGroup g;
	
	private void initObject() {
		c = getContentPane();
		g = new ButtonGroup();
		jpButton = new JPanel();
		laImage = new JLabel("");
		apple = new JRadioButton("���");
		pear = new JRadioButton("��");
		cherry = new JRadioButton("ü��");
	}
	
	private void initSetting() {
		jpButton.setOpaque(true);
		jpButton.setBackground(Color.DARK_GRAY);
		laImage.setOpaque(true);
		laImage.setHorizontalAlignment(SwingConstants.CENTER);
		setTitle("������ư ItemEvent ����");
		setSize(250, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void initBatch() {
		c.add(jpButton, BorderLayout.NORTH);
		c.add(laImage, BorderLayout.CENTER);
		
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		jpButton.add(apple);
		jpButton.add(pear);
		jpButton.add(cherry);
	}
	
	private void initEvent() {
		apple.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (apple.isSelected()) {
					laImage.setIcon(new ImageIcon("images/07apple.jpg"));
				}
			}
		});
		pear.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (pear.isSelected()) {
					laImage.setIcon(new ImageIcon("images/pear.jpg"));
				}
			}
		});
		cherry.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (cherry.isSelected()) {
					laImage.setIcon(new ImageIcon("images/07cherry.jpg"));
				}
			}
		});
	}
	
	public Ex07() {
		initObject();
		
		initSetting();
		
		initBatch();
		
		initEvent();
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Ex07();
	}
}
