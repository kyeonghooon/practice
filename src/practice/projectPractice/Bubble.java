package practice.projectPractice;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Bubble extends JLabel {

	private ImageIcon bubble; // 기본 물방울

	int y;

	// 연관관계, 의존성 컴포지션 관계, 생성자 의존 주입 (DI)
	public Bubble() {
		initData();
		setInitLayout();

		new Thread(() -> {
			boolean flag = true;
			while (flag) {
				y++;
				setLocation(300, y);
				System.out.println("작동함");
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (y > 630) {
					setIcon(null);
					flag = false;
				}
			}
		}).start();
		System.out.println("버블 생성됨");
	}

	private void initData() {
		bubble = new ImageIcon("images/bubble.png");
		y = 0;
	}

	private void setInitLayout() {
		setIcon(bubble);
		setSize(50, 50);
		setLocation(300, y);
	}

}
