import java.util.Scanner;

public class javaD14 {
    public static void main(String[] args) {
        System.out.println("Enter no of terms to see Fibonacci series till: ");
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int i = 1, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");
        while (i <= n) {
            System.out.print(firstTerm + ", ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            i++;
        }
    }
}
