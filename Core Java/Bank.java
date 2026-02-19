// Custom Exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class Bank {

    static void withdraw(int balance, double amount)
            throws InsufficientBalanceException {

        if (balance - amount < 1000) {
            throw new InsufficientBalanceException(
                "Minimum balance of 1000 must be maintained");
        } else {
            System.out.println("Withdraw successful");
        }
    }

    public static void main(String args[]) {
        try {
            withdraw(4000, 5000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
