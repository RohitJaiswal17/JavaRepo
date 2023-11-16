package OopsConsoleProject;

public class BankAccount {

	private String accountNumber;
	private double balance;

	public BankAccount(String accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = 0;
	}

	void deposite(double amount) {
		balance = balance + amount;
		System.out.println("Deposited: " + amount);
	}

	void withdraw(double amount) {

		if (balance >= amount) {
			balance = balance - amount;
			System.out.println("Withdraw: " + amount);
		} else {
			System.out.println("Insufficient funds");
		}
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
