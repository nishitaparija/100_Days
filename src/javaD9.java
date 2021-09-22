public class javaD9 {
    public static void main(String[] args) {
        double[] arr = {19, 12.89, 16.5, 13.4, 13.7};
        double total=0;

        for(int i=0; i<arr.length; i++)
        {
            total = total + arr[i];
        }
        double avg = total / arr.length;
        System.out.format("The average is: %.3f", avg);
    }
}