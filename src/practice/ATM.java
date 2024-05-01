package practice;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Account[] accountList = new Account[100];
		accountList[0] = new Account("홍길동", "1234");
		accountList[1] = new Account("이순신", "1111");
		accountList[2] = new Account("강감찬", "1212");
		
		final int DEPOSITE = 1;
		final int WITHDRAW = 2;
		final int TRASNFER = 3;
		final int END = 4;
		boolean flag = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println("pin을 입력하세요");
		String pin = sc.nextLine();
		Account user = Account.checkPinNumber(name, pin, accountList);
		if (user != null) {
			while (flag) {
				System.out.println("\n1. 현금 입금");
				System.out.println("2. 현금 출금");
				System.out.println("3. 계좌 이체");
				System.out.println("4. 종료");
				System.out.println("번호를 선택하세요 : ");
				int choice = sc.nextInt();
				sc.nextLine();
				if (choice == DEPOSITE) {
					System.out.print("입금액 : ");
					int money = sc.nextInt();
					sc.nextLine();
					user.deposit(user, money);
					System.out.println("현재 잔액은 " + user.getBalance() + "입니다.");
					System.out.println("------------------------------");
				} else if (choice == WITHDRAW) {
					System.out.println("출금액 : ");
					int money = sc.nextInt();
					sc.nextLine();
					user.withdraw(user, money);
					System.out.println("현재 잔액은 " + user.getBalance() + "입니다.");
					System.out.println("------------------------------");
				} else if (choice == TRASNFER) {
					System.out.println("이체액 : ");
					int money = sc.nextInt();
					sc.nextLine();
					System.out.println("이체 계좌 번호 : ");
					int accountNumber = sc.nextInt();
					sc.nextLine();
					Account toAccunt = user.findAccount(accountNumber, accountList);
					user.transfer(toAccunt, money);
				} else if (choice == END) {
					System.out.println("프로그램을 종료합니다.");
					flag = false;
				} else {
					System.out.println("잘못된 입력입니다.");
				}
			}
			
			
			
		} else {
			System.out.println("프로그램을 종료합니다.");
		}
		sc.close();
	}

}
