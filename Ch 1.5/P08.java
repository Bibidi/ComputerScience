public class P08 {
    public static void main(String[] args) {
        double g = 0.0;
        double h = 0.0;
        int n = 0;

        while (!StdIn.isEmpty()) {
            double x = StdIn.readDouble();
            g += Math.log(x);
            h += 1.0 / x;
            n++;
        }
        g = Math.exp((1.0 / n) * g);
        h = (double) n / h;
        System.out.println("Geometric mean: " + g);
        System.out.println("Harmonic mean: " + h);
    }
}
