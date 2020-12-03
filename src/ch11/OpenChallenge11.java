package ch11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class OpenChallenge11 extends JFrame {
	private Container c;
	private JLabel laImage;
	private JPanel jpMenu;
	private JButton btnLeft, btnRight;
	private ImageIcon[] imageBox;
	private int index;
	
	private void initObject() {
		c = getContentPane();
		laImage = new JLabel();
		jpMenu = new JPanel();
		btnLeft = new JButton();
		btnRight = new JButton();
		imageBox = new ImageIcon[4];
		imageBox[0] = new ImageIcon("OC11/image0.jpg");
		imageBox[1] = new ImageIcon("OC11/image1.jpg");
		imageBox[2] = new ImageIcon("OC11/image2.jpg");
		imageBox[3]	= new ImageIcon("OC11/image3.jpg");
		index = 0;
	}
	
	private void initSetting() {
		setTitle("Open Challenge 11");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 400);
		btnLeft.setIcon(new ImageIcon("OC11/left.png"));
		btnRight.setIcon(new ImageIcon("OC11/right.png"));
		jpMenu.setBackground(Color.DARK_GRAY);
		laImage.setHorizontalAlignment(SwingConstants.CENTER);
	}
	
	private void initBatch() {
		c.add(laImage, BorderLayout.CENTER);
		c.add(jpMenu, BorderLayout.SOUTH);
		jpMenu.add(btnLeft);
		jpMenu.add(btnRight);
		laImage.setIcon(imageBox[index]);
	}
	
	private void initEvent() {
		btnLeft.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (index == 0) {
					index = 3;
				} else {
					index -= 1;
				}
				laImage.setIcon(imageBox[index]);
			}
		});
		btnRight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (index == 3) {
					index = 0;
				} else {
					index += 1;
				}
				laImage.setIcon(imageBox[index]);
			}
		});
	}
	
	public OpenChallenge11() {
		initObject();
		
		initSetting();
		
		initBatch();
		
		initEvent();
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new OpenChallenge11();
	}
}
