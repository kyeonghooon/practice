package practice.goldgame;


public class Hero extends Sprite{
	
	int hp;
	
	public Hero() {
		x = (int)(Math.random() * 4 + 1);
		y = (int)(Math.random() * 4 + 1);
		hp = 10;
		image = "@ ";
	}
	
	boolean getGold(Gold gold) {
		if (this.x == gold.getX() && this.y == gold.getY()) {
			System.out.println("황금 획득!!");
			return false;
		} else {
			return true;
		}
	}
	boolean ifDie() {
		if (hp == 0) {
			return false;
		} else {
			return true;
		}
	}
	void fightMonster(Monster monster) {
		if (this.x == monster.getX() && this.y == monster.getY()) {
			hp = 0;
		}
	}
	
	@Override
	void move(String c) {
		switch (c) {
		case UP :
			if (y == 0) {
				System.out.println("더이상 위로 갈수 없음");
				break;
			} else {
				y--;
				break;
			}
		case LEFT :
			if (x == 0) {
				System.out.println("더이상 왼쪽으로 갈수 없음");
				break;
			} else {
				x--;
				break;
			}
		case RIGHT :
			if (x == 9) {
				System.out.println("더이상 오른쪽으로 갈수 없음");
				break;
			} else {
				x++;
				break;
			}
		case DOWN :
			if (y == 9) {
				System.out.println("더이상 아래쪽으로 갈수 없음");
				break;
			} else {
				y++;
				break;
			}
		}
	}

}