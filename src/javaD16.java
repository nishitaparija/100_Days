import java.util.Scanner;
public class javaD16 {
    public static void main(String[] args) {
        System.out.println("Do you want to create a new account? Press enter 2 times to terminate.");

        String name, gender, add, password;
        int age;
        String contact, occupation;
        Scanner SC=new Scanner(System.in);

        System.out.print("Enter name: ");
        name= SC.nextLine();
        System.out.print("Enter Gender (M/F/T/other): ");
        gender=SC.next();
        System.out.print("Enter age: ");
        age=SC.nextInt();
        Scanner ad=new Scanner(System.in);
        System.out.print("Enter address: ");
        add= ad.nextLine();
        Scanner pass=new Scanner(System.in);
        System.out.print("Enter password: ");
        password= pass.nextLine();
        Scanner occ=new Scanner(System.in);
        System.out.print("Enter your occupation: ");
        occupation= occ.nextLine();
        Scanner con_num=new Scanner(System.in);
        System.out.print("Enter your contact number: ");
        contact= con_num.nextLine();
        System.out.println("Enter your Name: " + name);
        System.out.println("Enter Gender: " + gender);
        System.out.println("Enter your Age: " + age);
        System.out.println("Add your Address: " + add);
        System.out.println("Enter your mobile number: " + contact);
        System.out.println("Enter your occupation: " + occupation);
        System.out.println("Select a password: " + password);
        System.out.println("Your new account has be successfully created.");
        System.out.println("Now go back and select a mode to deposit money to the account.");
    }
}
