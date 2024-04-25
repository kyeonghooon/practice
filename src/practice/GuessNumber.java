package practice;

import java.util.*;

public class GuessNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int targetNumber = random.nextInt(100) + 1;
		int count = 1;
		while (true) {
			System.out.println("1부터 100까지의 숫자를 입력해주세요");
			int inputNumber = sc.nextInt();
			if (inputNumber == targetNumber) {
				System.out.println("정답을 맞추셨습니다. 정답 : " + inputNumber);
				System.out.println("당신의 시도 횟수 : " + count);
				break;
			} else if (inputNumber < targetNumber) {
				System.out.println(inputNumber + "보다 큽니다.");
			} else {
				System.out.println(inputNumber + "보다 작습니다.");
			}
			count++;
		}
		sc.close();
	}

}
