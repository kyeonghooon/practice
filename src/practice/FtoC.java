package practice;

import java.util.Scanner;

public class FtoC {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("=============================");
			System.out.println("1. 화씨-->섭씨");
			System.out.println("2. 섭씨-->화씨");
			System.out.println("=============================");
			System.out.println();
			
			System.out.print("\n번호를 선택하시오: ");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.print("화씨온도를 입력하세요: ");
				double temf = sc.nextDouble();
				double temc = (5.0/9.0)*(temf - 32);
				System.out.println("섭씨온도는 " + temc);
				break;
			} else if (choice == 2){
				System.out.println("섭씨온도를 입력하세요: ");
				double temc = sc.nextDouble();
				double temf = (9.0/5.0)*temc + 32;
				System.out.println("화씨온도는 " + temf);
				break;
			} else {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
			}
		}
		sc.close();
		
	}

}
