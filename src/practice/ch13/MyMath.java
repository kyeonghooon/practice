package practice.ch13;

import java.util.ArrayList;
import java.util.Scanner;

public class MyMath {
	public static <T extends Number> double getAverage(ArrayList<T> list) {
		double sum = 0;
		for (T t : list) {
			sum += Double.parseDouble(t + "");
		}
		
		return sum/list.size();
	}
	
	// 테스트 코드
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		
	}
}
