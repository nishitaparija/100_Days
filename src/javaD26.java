import java.util.*;
import java.lang.*;
import java.io.*;
public class javaD26 {

    Exception e;

    public static void main(String[] args) throws Exception {
        try {
            Scanner s = new Scanner(System.in);
            int t;
            t = s.nextInt();
            int i, j, k;
            for (i = 0; i < t; i++) {
                String str1 = s.next();
                String str2 = s.next();
                String x = s.next();
                ArrayList<String> arr1 = new ArrayList<>();
                for (j = 0; j < x.length(); j++) {
                    String tmp = "";
                    for (k = j; k < x.length(); k++) {
                        tmp = tmp + x.charAt(k) + "";
                        arr1.add(tmp);
                    }
                }
                Set<String> okay = new HashSet<>();
                for (j = 0; j < str1.length(); j++) {
                    String temp = "";
                    temp = temp + str1.charAt(j) + "";
                    if (arr1.contains(temp))
                        okay.add(temp);
                    for (k = 0; k < str2.length(); k++) {
                        String temp2 = "";
                        temp2 = temp2 + str2.charAt(k) + "";
                        if (arr1.contains(temp2))
                            okay.add(temp2);
                        if (arr1.contains(temp.concat(temp2)))
                            okay.add(temp.concat(temp2));
                        if (arr1.contains(temp2.concat(temp)))
                            okay.add(temp2.concat(temp));
                    }
                }
                Object obj[] = okay.toArray();
                System.out.print(obj.length);
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }
}