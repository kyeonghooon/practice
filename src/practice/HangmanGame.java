package practice;

import java.util.Random;
import java.util.Scanner;

public class HangmanGame {

	public static void main(String[] args) {
		String[] words = { "java", "count", "school", "book", "student", "programmer" };
		int index = (new Random()).nextInt(words.length);
		String solution = words[index];
		StringBuffer answer = new StringBuffer(solution.length());
		for (int i = 0; i < solution.length(); i++) {
			answer.replace(i, i + 1, "_");
		}
		System.out.println("행맨 게임에 오신 것을 환영합니다.");
		int count = 0;
		try (Scanner scanner = new Scanner(System.in)) {
			while (answer.indexOf("_") != -1) {
				System.out.println("현재의 상태 : " + answer);
				System.out.print("글자를 추측하시오 : ");
				String input = scanner.nextLine();
				int solutionIndex;
				if ((solutionIndex = solution.indexOf(input)) != -1) {
					answer.replace(solutionIndex, solutionIndex + 1, input);
				}
				count++;
			}
			System.out.println("성공!! 정답은 [" + answer + "] 입니다.");
			System.out.println("총 시도 횟수 : " + count);
		} catch (Exception e) {
		}
	}
}
