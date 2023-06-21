import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class SavingsAccount {
    private int accountNumber;
    private double balance;

    public SavingsAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void depositAmount(double amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " successfully made. New balance: " + balance);
    }

    public void withdrawAmount(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance. Cannot withdraw " + amount);
        }

        balance -= amount;
        System.out.println("Withdrawal of " + amount + " successfully made. New balance: " + balance);
    }
}

public class pract19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();

        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        SavingsAccount account = new SavingsAccount(accountNumber, balance);

        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        account.depositAmount(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        try {
            account.withdrawAmount(withdrawAmount);
        }
         catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
