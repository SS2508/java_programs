public class Account {
    private int accountId;
    private double balance;

    public Account(int accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount " + amount + " deposited. New balance is " + balance + ".");
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Amount " + amount + " withdrawn. New balance is " + balance + ".");
        }
    }

    public Account search(int accountId) {
        if (this.accountId == accountId) {
            return this;
        } else {
            return null;
        }
    }

    public void display() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
		// Create a new account with ID 123 and balance 1000
		Account acc = new Account(123, 1000);

		// Deposit 500 into the account
		acc.deposit(500);

		// Withdraw 200 from the account
		acc.withdraw(200);

		// Search for an account with ID 123
		Account foundAcc = acc.search(123);

		// Display the details of the found account
		foundAcc.display();
	}
}

