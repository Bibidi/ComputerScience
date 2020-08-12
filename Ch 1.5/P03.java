public class P03 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = StdIn.readDouble();
        }

        double sum1 = 0.0;
        for (int i = 0; i < n; i++) {
            sum1 += a[i];
        }
        double mean = sum1 / n;

        double sum2 = 0.0;
        for (int i = 0; i < n; i++) {
            sum2 += (a[i] - mean) * (a[i] - mean);
        }
        double stdDev = Math.sqrt(sum2 / (n - 1));

        StdOut.println("Mean: " + mean);
        StdOut.println("Sample standard deviation: " + stdDev);
    }
}
