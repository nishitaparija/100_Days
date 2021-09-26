// program to deposit amount in an account.
import java.util.Scanner;
public class javaD13 {
    public static void main(String[] args) {
        double bal = 65000;
        System.out.println("Enter your Account number.");
        Scanner scan_accnum = new Scanner(System.in);
        String account_no = String.valueOf(scan_accnum.nextInt());
        System.out.println("Enter your numeric password: ");
        Scanner scan_pass = new Scanner(System.in);
        String password = String.valueOf(scan_pass.nextInt());
        System.out.println("Enter Amount to deposit: ");
        Scanner scan_amt = new Scanner(System.in);
        float amount = scan_amt.nextFloat();
        if (amount <= 0)
            System.out.println("Can't deposit non positive amount.");
        else {
            double balance = 65000 + amount;
            System.out.println("Rs. " + amount + " has been deposited.");
            double curr_bal = balance + amount;
            System.out.println("Current Balance is " + curr_bal);
        }
    }
}