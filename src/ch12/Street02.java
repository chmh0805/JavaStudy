package ch12;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Street02 extends JFrame {
	
	int x = 350;
	int y = 20;
	boolean isRunning = true;
	
	Container c;
	JButton btn;
	
	public Street02() {
		setTitle("ÀåÇ³");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(900, 300);
		setLocationRelativeTo(null); // ¸ð´ÏÅÍ Á¤Áß¾Ó¿¡ JFrame ¹èÄ¡
		
		c = getContentPane();
		c.add(new GamePanel());
		
		setVisible(true);
	}

	// FlowLayout
	class GamePanel extends JPanel {
		ImageIcon imgIconPlayer, imgIconJang;
		Image imgPlayer, imgJang;
		
		public GamePanel() {
			imgIconPlayer = new ImageIcon("images/player.png");
			imgIconJang = new ImageIcon("images/jang.png");
			imgPlayer = imgIconPlayer.getImage();
			imgJang = imgIconJang.getImage();
			btn = new JButton("¸ØÃã");
			add(btn);
			
			setFocusable(true);
			requestFocus();
			
			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					isRunning = !isRunning;
				}
			});
			
			addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
						if (x >= 650) {
							return;
						} else {
							x = x + 10;
						}
					} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
						if (x <= 350) {
							return;
						} else {
							x = x - 10;
						}
					} else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
						new Thread(new Runnable() {
							@Override
							public void run() {
								while (isRunning) {
									if (x == 650) {
										break;
									}
									try {
										x = x + 1;
										repaint();
										Thread.sleep(3);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}
							}
						}).start();
					}
					repaint();
				}
			});
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(imgPlayer, 0, 0, null);
			g.drawImage(imgJang, x, y, null);
		}
	}


	public static void main(String[] args) {
		new Street02();
	}
}
