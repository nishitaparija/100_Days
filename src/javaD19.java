//Postfix evaluation in java
import java.util.*;
public class javaD19 {
    protected  static int evalPostfix(String express){
        Stack<Integer> st = new Stack<>();

        for(int i=0; i < express.length(); i++)
        {
            char ch = express.charAt(i);
            if(Character.isDigit(ch))
                st.push(ch - '0');
            else
            {
                int value1 = st.pop();
                int value2 = st.pop();
                switch (ch) {
                    case '+' -> st.push(value2 + value1);
                    case '-' -> st.push(value2 - value1);
                    case '*' -> st.push(value2 * value1);
                    case '/' -> st.push(value2 / value1);
                }
            }
        }
        return st.pop();   // result return
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a operation: ");
        String express= sc.next();
        System.out.println("Postfix evaluation of the given expression comes out to be :" +evalPostfix(express));
    }
}