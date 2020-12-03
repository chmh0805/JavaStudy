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
		laList = new JLabel("��� 100��,�� 500��,ü�� 20000��");
		checkBoxApple = new JCheckBox("���");
		checkBoxPear = new JCheckBox("��");
		checkBoxCherry = new JCheckBox("ü��");
		laSum = new JLabel("���� " + sum + "�� �Դϴ�.");
	}
	
	private void initSetting() {
		c.setLayout(new FlowLayout());
		setSize(250, 200);
		setTitle("üũ�ڽ��� ItemEvent ����");
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
				laSum.setText("���� " + sum + "�� �Դϴ�.");
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
				laSum.setText("���� " + sum + "�� �Դϴ�.");
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
				laSum.setText("���� " + sum + "�� �Դϴ�.");
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
