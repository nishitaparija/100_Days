import java.util.regex.*;
import java.util.*;
public class javaD30 {
    public static boolean isValidUsername(String name)
    {
        String regex = "^[A-Za-z]\\w{5,29}$";
        Pattern p = Pattern.compile(regex);
        if (name == null) {
            return false;
          }
        Matcher m = p.matcher(name);
        return m.matches();
    }
        public static void main(String[] args)
        {
            System.out.println("Use Uppercase, lowercase and underscore only.");

            Scanner sc= new Scanner(System.in);
            System.out.print("Enter a string: ");
            String str= sc.nextLine();
            System.out.println(isValidUsername(str));

            Scanner scan= new Scanner(System.in);
            System.out.print("Enter a string: ");
            String str2= scan.nextLine();
            System.out.println(isValidUsername(str2));

            Scanner s= new Scanner(System.in);
            System.out.print("Enter a string: ");
            String str3= s.nextLine();
            System.out.println(isValidUsername(str3));
        }
}