//Program to reverse a string without using String inbuilt function.

import java.util.Scanner;
public class javaD17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str= sc.next();
        StringBuilder str2 = new StringBuilder();
        str2.append(str);
        str2 = str2.reverse();
        System.out.println(str2);
    }
}