package practice.projectPractice;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BeatFrame extends JFrame {

	private JLabel backgroundMap;
	boolean flag = true;

	public BeatFrame() {
		initData();
		setInitLayout();
		
//		new Thread(() -> {
//			try {
//				Thread.sleep(168000);
//				System.out.println("작동작동");
//				flag = false;
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}).start();
//		
//		while (flag) {
//			try {
//				Thread.sleep(428, 5714);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			add(new Bubble());
//		}
		
	}

	private void initData() {
		backgroundMap = new JLabel(new ImageIcon("images/background1.jpg"));
		setContentPane(backgroundMap);
		setSize(1600, 900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// BGM bgm = new BGM();
		// bgm.gainControl.setValue(-30.0f);
	}

	private void setInitLayout() {
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new BeatFrame();
	}
}
