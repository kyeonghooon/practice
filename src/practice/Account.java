package basic.practice;

public class Account {
	private static int accountNumberCount = 101000;
	private String name;
	private String pinNumber;
	private int accountNumber;
	private int balance;
	
	public Account(String name, String pinNumber) {
		this.name = name;
		this.pinNumber = pinNumber;
		this.accountNumber = ++accountNumberCount;
	}
	
	// getter
	public static int getAccountNumberCount() {
		return accountNumberCount;
	}

	public String getPinNumber() {
		return pinNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}
	// 0. pinNumber 확인
	public static Account checkPinNumber(String name, String pinNumber, Account[] account) {
		for (int i = 0; i < account.length; i++) {
			if (account[i].getName().equals(name) && account[i].getPinNumber().equals(pinNumber)) {
				System.out.println("확인되었습니다.");
				return account[i];
			}
		}
		System.out.println("잘못된 입력입니다.");
		return null;
	}
	
	// 1. 현금 입금
	public void deposit(Account account, int money) {
		balance += money;
		
	}
	// 2. 현금 인출
	public void withdraw(Account account, int money) {
		if (balance < money) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		balance -= money;
		
	}
	// 3. 계좌 이체
	public void transfer(Account toAccount, int money) {
		if (this.balance < money) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		this.withdraw(this , money);
		toAccount.deposit(toAccount, money);
		System.out.println("이체되었습니다.");
	}
	// 계좌 번호로 계좌 찾기
	public Account findAccount(int accountNumber, Account[] account) {
		for (int i = 0; i < account.length; i++) {
			if (account[i] != null && accountNumber == account[i].getAccountNumber()) {
				return account[i];
			}
		}
		System.out.println("해당하는 계좌가 없습니다.");
		return null;
	}
}
