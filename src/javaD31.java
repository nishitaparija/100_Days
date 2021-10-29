import java.util.Scanner;
public class javaD31 {
        public static void main(String[] args) {
            // find GCD between n1 and n2
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the first number: ");
            int n1=sc.nextInt();
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter the second number: ");
            int n2=scan.nextInt();

            while(n1 != n2) {

                if(n1 > n2) {
                    n1 -= n2;
                }

                else {
                    n2 -= n1;
                }
            }

            System.out.println("GCD: " + n1);
        }
}