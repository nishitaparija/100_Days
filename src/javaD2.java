public class javaD2 {
    public static void main(String [] args)
    {
        int a = 5, i, j; //a = No. of rows
        System.out.println("Displaying the pattern below: ");
           for(i = 0; i < a; i++) //loop for row
             {for(j = 0; j <= i; j++)//loop for column
        {
            System.out.print("*");
        }
        System.out.println();
     }
   }
}