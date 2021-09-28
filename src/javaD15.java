import java.util.Scanner;
public class javaD15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int num1 = num;
        int rem;
        int result = 0;
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            result = (result + rem) * 10;
        }
        result /= 10;
        if (result == num1) {
            System.out.println("The number entered is a Palindrome number.");
        } else {
            System.out.println("The number entered is NOT a Palindrome number.");
        }
    }
}
