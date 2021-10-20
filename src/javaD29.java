import java.util.*;
public class javaD29 {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter password: ");
        String a= sc.nextLine();

        boolean validPassword = isValidPassword(a);
        System.out.println("valid password:" +validPassword);

        Scanner scan= new Scanner(System.in);
        System.out.print("Enter password: ");
        String b= scan.nextLine();

        boolean validPassword1 = isValidPassword(b);
        System.out.println("valid password:" +validPassword1);
    }

    public static boolean isValidPassword(String password)
    {
        boolean isValid = true;
        if (password.length() > 15 || password.length() < 8)
        {
            System.out.println("Password must be less than 20 and more than 8 characters in length.");
            isValid = false;
        }
        String upperCaseChars = "(.*[A-Z].*)";
        if (!password.matches(upperCaseChars ))
        {
            System.out.println("Password must have at least one uppercase character");
            isValid = false;
        }
        String lowerCaseChars = "(.*[a-z].*)";
        if (!password.matches(lowerCaseChars ))
        {
            System.out.println("Password must have at least one lowercase character");
            isValid = false;
        }
        String numbers = "(.*[0-9].*)";
        if (!password.matches(numbers ))
        {
            System.out.println("Password must have at least one number");
            isValid = false;
        }
        String specialChars = "(.*[@,#,$,%,&].*$)";
        if (!password.matches(specialChars ))
        {
            System.out.println("Password must have at least one special character among @#$%&");
            isValid = false;
        }
        return isValid;
    }
}