public class javaD8 {
    public static void main(String[] args) {
        int[][] two_ele = {
                {10, 20, 30},
                {40, 50, 60}
        };
        System.out.print("Original Array:\n");
        print_array(two_ele);
        System.out.print("After changing the rows and columns of the said array: \n");
        transpose(two_ele);
    }

    private static void transpose(int[][] two_ele) {

        int[][] newtwo_ele = new int[two_ele[0].length][two_ele.length];
        for (int i = 0; i < two_ele.length; i++) {
            for (int j = 0; j < two_ele[0].length; j++) {
                newtwo_ele[j][i] = two_ele[i][j];
            }
        }

        print_array(newtwo_ele);
    }
    private static void print_array(int[][] two_ele) {
        for (int i = 0; i < two_ele.length; i++) {
            for (int j = 0; j < two_ele[0].length; j++) {
                System.out.print(two_ele[i][j] + " ");
            }
            System.out.println();
        }

    }
}
