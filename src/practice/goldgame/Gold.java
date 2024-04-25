package practice.goldgame;

public class Gold extends Sprite{

	public Gold() {
		image = "G ";
		x = (int)(Math.random() * 9);
		y = (int)(Math.random() * 9);
	}
	
	@Override
	void move(String c) {
		System.out.println("움직이지 않음");
	}

}