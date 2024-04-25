package practice.goldgame;

public class Monster extends Sprite{

	public Monster() {
		x = (int)(Math.random() * 4 + 5);
		y = (int)(Math.random() * 4 + 5);
		image = "M ";
	}
	public String direction() {
		int direction = (int)(Math.random() * 4);
		if (direction == 0) return UP;
		else if (direction == 1) return LEFT;
		else if (direction == 2) return RIGHT;
		else return DOWN;
	}
	
	
	@Override
	void move(String c) {
		switch (c) {
		case UP :
			if (y <= 1) {
				y++;
				break;
			} else {
				y -= 2;
				break;
			}
		case LEFT :
			if (x <= 1) {
				x++;
				break;
			} else {
				x -= 2;
				break;
			}
		case RIGHT :
			if (x >= 8) {
				x--;
				break;
			} else {
				x += 2;
				break;
			}
		case DOWN :
			if (y >= 8) {
				y--;
				break;
			} else {
				y += 2;
				break;
			}
		}
	
		
	}

}