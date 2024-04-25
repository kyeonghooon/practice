package practice;

public class Game369 {

	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {
			int a = i / 10; // 10의 자리수
			int b = i % 10; // 1의 자리수
			if ((a == 3 || a == 6 || a == 9) && (b == 3 || b == 6 || b == 9)) {
				System.out.print("짝짝 ");
			} else if ((a == 3 || a == 6 || a == 9) || (b == 3 || b == 6 || b == 9)) {
				System.out.print("짝 ");
			} else {
				System.out.print(i + " ");
			}
			// 10개 마다 줄바꿈을 위한 코드
			if (i%10 == 0) {
				System.out.println();
			}
		}
	}
		
}
