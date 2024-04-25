package practice;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.print("2부터 100사이의 모든 소수 : ");
		for (int i = 2; i < 101; i++) {
			boolean flag = true; // 어떤 수로 나누어 떨어질 때를 체크 하기위함
			for (int j = 2; j < i; j++) {
				if (i % j == 0){
					flag = false;
				}
			}
			if (flag) {
				System.out.print(i + " ");
			}
		}
	}

}
