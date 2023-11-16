package OopsConsoleProject;

public class Customer {

	private String name;
	private BankAccount[] accounts;
	private int numberOfAccounts;

	public Customer(String name, int maxAccount) {

		this.name = name;
		this.accounts = new BankAccount[maxAccount];
		this.numberOfAccounts = 0;
	}

	public void addAccount(String accountNumber) {

		if (numberOfAccounts < accounts.length) {

			BankAccount account = new BankAccount(accountNumber);
			accounts[numberOfAccounts] = account;
			numberOfAccounts++;
			System.out.println("Account added successfully");
		} else {
			System.out.println("Cannot add more accounts.Maximum Limit reached. ");
		}
	}

	public BankAccount getAccount(String accountNumber) {

		for (int i = 0; i < numberOfAccounts; i++) {

			if (accounts[i].getAccountNumber().equals(accountNumber)) {
				return accounts[i];     
			}
		}

		return null; // Account not found
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
