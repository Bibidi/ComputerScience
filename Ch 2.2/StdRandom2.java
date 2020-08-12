public class StdRandom2 {
    public static int uniform(int n) {
        return (int) (Math.random() * n);
    }

    public static double uniform(double lo, double hi) {
        return lo + Math.random() * (hi - lo);
    }

    public static boolean bernoulli(double p) {
        return Math.random() < p;
    }

    public static double gaussian() {
        return 1.0;
    }

    public static double gaussian(double mu, double sigma) {
        return mu + sigma * gaussian();
    }

    public static int discrete(double[] probabilities) {
        double r = Math.random();
        double sum = 0.0;
        for (int j = 0; j < probabilities.length; j++) {
            sum += probabilities[j];
            if (r < sum) return j;
        }
        return -1;
    }

    public static void shuffle(double[] a) {

    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double[] probabilities = { 0.5, 0.3, 0.1, 0.1 };
        for (int i = 0; i < n; i++) {
            StdOut.printf(" %2d ", uniform(100));
            StdOut.printf("%8.5f ", uniform(10.0, 99.0));
            StdOut.printf("%5b ", bernoulli(0.5));
            StdOut.printf("%7.5f ", gaussian(9.0, 0.2));
            StdOut.printf("%2d ", discrete(probabilities));
            StdOut.println();
        }
    }
}
