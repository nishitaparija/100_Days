public class javaD21 {
    public int sum(int x, int y)
    {
        return (x + y);
    }

    // Overloaded sum(). This sum takes three int parameters
    public int sum(int x, int y, int z)
    {
        return (x + y + z);
    }

    // Overloaded sum(). This sum takes two double parameters
    public double sum(double x, double y)
    {
        return (x + y);
    }

    // Driver code
    public static void main(String args[])
    {
        Sum s = new Sum();
        System.out.println(s.sum(10, 10, 20.89));
        System.out.println(s.sum(10, 20.47, 30));
        System.out.println(s.sum(10, 10.5, 20.5));
    }

    private static class Sum {
        public double sum(int i2, double i, double i1) {
            return i;
        }
    }
}