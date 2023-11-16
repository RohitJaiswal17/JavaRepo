package OopsConsoleProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Get customer name from user input
		System.out.println("Enter customer name: ");
		String customerName = scanner.nextLine();

		// Get the maximum number of accounts from user input

		System.out.println("Enter the maximmum number of accounts");
		int maxAccount = scanner.nextInt();

		// Create a customer
		Customer customer1 = new Customer(customerName, maxAccount);
		
		scanner.nextLine();

		// Add accounts for the customer

		for (int i = 0; i < maxAccount; i++) {
			System.out.println("Enter account-number for account" + (i + 1) + ":");
			String accountNumber = scanner.nextLine();
			customer1.addAccount(accountNumber);
		}

		// Access and use the accounts

		System.out.println("Enter account number to perform operations: ");
		String accountNumber = scanner.nextLine();

		BankAccount account = customer1.getAccount(accountNumber);

		if (account != null) {
			System.out.println("Enter 1 to Deposite, 2 to Withdraw");
			int choice = scanner.nextInt();

			if (choice == 1) {
				System.out.println("Enter deposite amount");
				double amount = scanner.nextDouble();

				account.deposite(amount);
			} else if (choice == 2) {
				System.out.println("Enter withdrawl amount: ");
				double amount = scanner.nextDouble();

				account.withdraw(amount);
			}
			else
			{
				System.out.println("Invalid choice...!");
			}
		}
		else
		{
			System.out.println("Account not found");
		}
	}

}
