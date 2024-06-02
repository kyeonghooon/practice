package practice;

import java.util.Scanner;

public class SumIntException {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String input;
			int sum = 0;
			while (!(input = scanner.nextLine()).equals("")) {
				try {
					int number = Integer.parseInt(input);
					sum += number;
				} catch (NumberFormatException e) {
					System.out.println("NumberFormatException 발생");
				} 
			}
			System.out.println("정수들의 합은 " + sum);
		} catch (Exception e) {
		}
	}

}
