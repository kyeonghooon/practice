package basic.practice;

public class DiceTest {

	public static void main(String[] args) {
		Dice dice1 = new Dice("주사위1");
		Dice dice2 = new Dice("주사위2");
		int count = 0;
		while (true) {
			count++;
			dice1.roll();
			dice2.roll();
			System.out.println();
			if (2 == dice1.getValue() + dice2.getValue()) {
				System.out.println("(1, 1)이 나오는데 걸린 횟수= " + count);
				break;
			}
		}
	}

}
