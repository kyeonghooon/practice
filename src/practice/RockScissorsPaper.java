package practice;

import java.util.Scanner;

public class RockScissorsPaper {
	final int SCISSORS = 0;
	final int ROCK = 1;
	final int PAPER = 2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2) : ");
		int computer = (int) (Math.random() * 3);
		int user = sc.nextInt();
		if (user == computer) {
			System.out.println("비겼습니다.");
		} else if (user == (computer + 1) % 3) {
			System.out.println("당신 : " + user + " 컴퓨터 : " + computer + " 당신이 이겼습니다.");
		} else {
			System.out.println("당신 : " + user + " 컴퓨터 : " + computer + " 당신이 졌습니다.");
		}
		sc.close();
	}

}
