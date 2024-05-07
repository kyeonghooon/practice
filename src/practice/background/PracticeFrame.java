package practice.background;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PracticeFrame extends JFrame{
	
	JPanel background;
	Image backImg;
	int backX = 0;
	
	public PracticeFrame() {
		initData();
		setLayout();
	}
	
	private void initData() {
		setBounds(100,100,450,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		backImg = (new ImageIcon("images/background1.jpg").getImage());
		background = new MyPanel();
	}
	private void setLayout() {
		add(background, BorderLayout.CENTER);
		setVisible(true);
	}
	class MyPanel extends JPanel{
		public MyPanel() {
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawImage(backImg, backX, 0, this);
		}
	}
	public static void main(String[] args) {
		new PracticeFrame();
	}
}
