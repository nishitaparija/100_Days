import java.util.Scanner;
public class javaD18 {
    public static void main(String[] args)
    {long units;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of units consumed: ");
        units=sc.nextLong();
        double billpay=0;
        if(units<100)
            billpay=units*1.20;

        else if(units<300)
            billpay=100*1.20+(units-100)*2;

        else if(units>300)
            billpay=100*1.20+200 *2+(units-300)*3;

        System.out.println("Bill Amount To Be Paid : " + billpay);
    }
}