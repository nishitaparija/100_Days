import java.util.Scanner;
public class javaD27 {
    public static void main(String[] args) {
        System.out.println("Enter no. between 1 to 5");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number: ");
        int number= sc.nextInt();
        String size;
        switch (number) {

            case 1:
                size = "Small";
                break;

            case 2:
                size = "Medium";
                break;

            case 3:
                size = "Large";
                break;

            case 4:
                size = "Extra Large";
                break;

            case 5:
                size = "Largest";
                break;

            default:
                size = "Unknown";
                break;

        }
        System.out.println("Size: " + size);
    }
}
