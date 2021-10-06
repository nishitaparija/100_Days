//program to carry out operation with an input number
import java.util.*;
public class javaD22 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=sc.nextInt();
        int var;

        var=a;
        System.out.println("Using '=' is: "+var);

        var+=a;
        System.out.println("Using '+=' is: "+var);

        var *= a;
        System.out.println("Using '*=' is: "+var);
    }
}
