package ch13;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

class FlickeringLabel extends JLabel implements Runnable {
	private long delay; // ������ �ٲ�� ���� �ð�, �и��ʴ���
	
	public FlickeringLabel(String text, long delay) { // ������
		super(text); // JLabel ������ ȣ��
		this.delay = delay;
		setOpaque(true); // ���� ������ �����ϵ��� ����
		
		// Thread�� ������(Ÿ��)�� this�� �ѱ�� ���� �� Ŭ������
		// Runnable�� ��ӹ޾� run�� ������ ��ü���� ǥ���Ѵ�.
		Thread th = new Thread(this);
		th.start();
	}
	
	@Override
	public void run() {
		int n = 0;
		while (true) {
			if (n == 0) {
				setBackground(Color.YELLOW);
			} else {
				setBackground(Color.GREEN);
			}
			
			if (n == 0) {
				n = 1;
			} else {
				n = 0;
			}
			
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
	
}

public class Ex03 extends JFrame {
	public Ex03() {
		setTitle("FlickeringLabel ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		FlickeringLabel fLa1 = new FlickeringLabel("����", 500); // 0.5��
		
		JLabel la = new JLabel("�ȱ���");
		
		FlickeringLabel fLa2 = new FlickeringLabel("���⵵ ����", 30);
		
		c.add(fLa1);
		c.add(la);
		c.add(fLa2);
		
		setSize(300, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex03();
	}
}
