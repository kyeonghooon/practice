package practice.goldgame;

import java.util.Scanner;

public class GoldGameTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Field field = new Field();
		Hero hero = new Hero();
		Monster monster = new Monster();
		Gold gold = new Gold();
		
		final String HERO = hero.image;
		final String MONSTER = monster.image;
		final String GOLD = gold.image;
		boolean flag = true;
		while (flag) {
			field.field[hero.y][hero.x] = hero.image;
			field.field[monster.y][monster.x] = monster.image;
			field.field[gold.y][gold.x] = gold.image;
			field.showField();
			field.field[hero.y][hero.x] = null;
			field.field[monster.y][monster.x] = null;
			System.out.print("WASD입력으로 움직이세요 : ");
			String choice = sc.nextLine();
			hero.move(choice);
			flag = hero.getGold(gold);
			monster.move(monster.direction());
			hero.fightMonster(monster);
			hero.ifDie();
		}
		sc.close();
	}

}