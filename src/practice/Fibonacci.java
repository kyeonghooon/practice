package practice;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int[] num = new int[3];
		int RESULT = 2; // 출력할 인덱스 번호
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 항의 개수 : ");
		int max = sc.nextInt();
		for (int i = 0; i < max; i++) {
			num[RESULT] = num[0] + num[1];
			num[0] = num[1];
			num[1] = num[RESULT];
			System.out.print(num[RESULT] + " ");
			
			// 피보나치 수열의 초기 0 1 을 맞추기 위해 작성
			if (num[RESULT] == 0) {
				num[0] = 1;
			}
		}
		sc.close();
	}

}
