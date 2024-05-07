package practice.projectPractice;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class InfiniteFrame extends JFrame{
	
	private MyPanel myPanel;
	private Image backImg = new ImageIcon("images/slamdunk.jpg").getImage();
	int backX1 = 0;
	int backX2 = 1280;
	public InfiniteFrame() {
		initData();
		setLayout();
	}
	
	private void initData() {
		setBounds(100, 100, 1280, 720);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myPanel = new MyPanel();
		new BGM();
	}
	private void setLayout() {
		add(myPanel);
		myPanel.setLayout(null);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		private Image image;
		
		public MyPanel() {
			image = new ImageIcon("images/slamdunk.jpg").getImage();
			setFocusable(true);
			new Thread(() -> {
				while(true) {
					backX1--;
					backX2--;
					if (backX1 < -1280) {
						backX1 = 1280;
					}
					if (backX2 < -1280) {
						backX2 = 1280;
					}
					repaint();
					try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}).start();
		}
		
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(image, backX1, 0, null);
			g.drawImage(image, backX2, 0, null);
		}
	}
	
	public static void main(String[] args) {
		new InfiniteFrame();
	}
}
