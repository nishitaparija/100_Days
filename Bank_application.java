import java.util.Scanner;
class InSufficientFundException extends RuntimeException {
    private final String message;
    public InSufficientFundException(String message) {
        this.message = message;
    }
    public InSufficientFundException(Throwable cause, String message) {
        super(cause);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
class Account {
    private int balance = 1000;
    public int balance() {
        return balance;
    }

    public void withdraw(int amount) throws InSufficientFundException {
        if (amount > balance) {
            throw new InSufficientFundException(String.format(
                    "Current balance %d is less than requested amount %d",
                    balance, amount));
        }
        balance = balance - amount;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(String.format(
                    "Invalid deposit amount %s", amount));
        }
    }
}
public class Bank_application {
        private static boolean quit=false;
        private static double interest;
        private static double curr_bal;
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int userChoice;
            double balance = 1000;
            double amount;
            double amount_rem;
            do {
                System.out.println("Enter your Account Number: ");
                Scanner scan_accnum = new Scanner(System.in);
                String account_no = String.valueOf(scan_accnum.nextInt());
                System.out.println("Enter your numeric password: ");
                Scanner scan_pass = new Scanner(System.in);
                String password = String.valueOf(scan_pass.nextInt());
                System.out.println("1. Deposit money");
                System.out.println("2. Withdraw money");
                System.out.print("Select your choice: ");
                userChoice = in.nextInt();
                switch (userChoice) {
                    case 1:// to deposit
                        deposit();
                        break;
                    case 2: //to withdraw
                        withdraw();
                        break;
                    default:
                        System.out.println("Invalid selection, please choose again.");
                        break;
                }
                System.out.println();
            }
            while (!quit);
        }
        public static void withdraw() {
            System.out.print("Enter Amount to withdraw: ");
            Scanner scan_amt = new Scanner(System.in);
            double amount_rem = scan_amt.nextFloat();
            double balance = 1000;
            if (amount_rem <= 0 || amount_rem < balance)
                System.out.println(+ amount_rem + " Withdrawn successfully.");
            else { if(amount_rem > 1000)
                System.out.println("Withdrawal not possible.");
                System.out.println("Exception in thread \"main\" com.jwt.core.java.InSufficientFundException: Current balance is less than requested amount 1000");
            }
            curr_bal=balance-amount_rem;
            System.out.println("Current balance is "+curr_bal);
        }
        public static void deposit() {
            System.out.print("Enter Amount to deposit: ");
            Scanner scan_amt = new Scanner(System.in);
            double amount = scan_amt.nextFloat();
            if (amount <= 0)
                System.out.println("Can't deposit non positive amount.");
            else {
                double balance = 1000;
                System.out.println("Rs. " + amount + " has been deposited.");
                curr_bal=balance+amount;
                System.out.println("Current Balance is "+curr_bal);
            }
        }
}