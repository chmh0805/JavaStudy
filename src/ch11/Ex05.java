package ch11;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex05 extends JFrame {
	private int priceApple, pricePear, priceCherry;
	private int sum;
	private Container c;
	private JLabel laList, laSum;
	private JCheckBox checkBoxApple, checkBoxPear, checkBoxCherry;
	
	private void initObject() {
		sum = priceApple + pricePear + priceCherry;
		c = getContentPane();
		laList = new JLabel("사과 100원,배 500원,체리 20000원");
		checkBoxApple = new JCheckBox("사과");
		checkBoxPear = new JCheckBox("배");
		checkBoxCherry = new JCheckBox("체리");
		laSum = new JLabel("현재 " + sum + "원 입니다.");
	}
	
	private void initSetting() {
		c.setLayout(new FlowLayout());
		setSize(250, 200);
		setTitle("체크박스와 ItemEvent 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void initBatch() {
		c.add(laList);
		c.add(checkBoxApple);
		c.add(checkBoxPear);
		c.add(checkBoxCherry);
		c.add(laSum);
	}
	
	private void checkBoxListener() {
		checkBoxApple.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				JCheckBox jcb = (JCheckBox)e.getSource();
				if (jcb.isSelected()) {
					priceApple = 100;
				} else {
					priceApple = 0;
				}
				sum = priceApple + pricePear + priceCherry;
				laSum.setText("현재 " + sum + "원 입니다.");
			}
		});
		checkBoxPear.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				JCheckBox jcb = (JCheckBox)e.getSource();
				if (jcb.isSelected()) {
					pricePear = 500;
				} else {
					pricePear = 0;
				}
				sum = priceApple + pricePear + priceCherry;
				laSum.setText("현재 " + sum + "원 입니다.");
			}
		});
		checkBoxCherry.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				JCheckBox jcb = (JCheckBox)e.getSource();
				if (jcb.isSelected()) {
					priceCherry = 20000;
				} else {
					priceCherry = 0;
				}
				sum = priceApple + pricePear + priceCherry;
				laSum.setText("현재 " + sum + "원 입니다.");
			}
		});
	}
	
	public Ex05() {
		initObject();
		
		initSetting();
		
		initBatch();
		
		checkBoxListener();
		
		setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		new Ex05();
	}
}
