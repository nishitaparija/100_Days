import java.util.*;
import java.lang.*;
public class javaD28 {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.next();

            int x = 0, y = 0;
            char p = 'A';
            for (int j = 0; j < n; j++) {
                if (s.charAt(j) != p) {
                    if (s.charAt(j) == 'L' && p != 'R')
                        x--;
                    else if (s.charAt(j) == 'R' && p != 'L')
                        x++;
                    else if (s.charAt(j) == 'U' && p != 'D')
                        y++;
                    else if (s.charAt(j) == 'D' && p != 'U')
                        y--;
                    p = s.charAt(j);
                }
            }
            System.out.println(x + " " + y);
        }
    }
}