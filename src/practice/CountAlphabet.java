package practice;

import java.util.Scanner;

public class CountAlphabet {

	public static void main(String[] args) {
		int[] counts = new int[26];
		try (Scanner scanner = new Scanner(System.in)){
			String input;
			while(!(input= scanner.nextLine()).equals("")) {
				int index = input.charAt(0) - 65;
				try {
					counts[index]++;
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("ArrayIndexOutOfBoundsException 발생");
				}
			}
			for (int i = 0; i < counts.length; i++) {
				if(counts[i] != 0) {
					char alphabet = (char)(i + 65);
					System.out.println(alphabet + ": " + counts[i] + "번");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
