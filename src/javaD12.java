//program to check eligibility to donate blood.
import java.util.Scanner;
public class javaD12 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your age : ");
            int age = sc.nextInt();
            System.out.println("Enter your weight in kg : ");
            int weight = sc.nextInt();
            if (age >= 18) {
                if (weight > 80)
                    System.out.println("You are eligible to donate blood");
            } else {
                if (weight < 50)
                    System.out.println("You are NOT eligible to donate blood");
            }
        }
}