public class StdStats2 {
    public static double max(double[] a) {
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < a.length; i++)
            if (a[i] > max) max = a[i];
        return max;
    }

    public static double min(double[] a) {
        double min = Double.POSITIVE_INFINITY;
        for (int i = 0; i < a.length; i++)
            if (a[i] < min) min = a[i];
        return min;
    }

    public static double mean(double[] a) {
        double sum = 0.0;
        for (int i = 0; i < a.length; i++)
            sum += a[i];
        return sum;
    }

    public static double var(double[] a) {
        double avg = mean(a);
        double sum = 0.0;
        for (int i = 0; i < a.length; i++) {
            sum += (a[i] - avg) * (a[i] - avg);
        }
        return sum / (a.length - 1);
    }

    public static double stddev(double[] a) {
        return Math.sqrt(var(a));
    }

    public static void plotPoints(double[] a) {
        int n = a.length;
        StdDraw.setXscale(-1, n);
        StdDraw.setPenRadius(1 / (3.0 * n));
        for (int i = 0; i < n; i++)
            StdDraw.point(i, a[i]);
    }

    public static void plotLines(double[] a) {
        int n = a.length;
        StdDraw.setXscale(-1, n);
        StdDraw.setPenRadius();
        for (int i = 1; i < n; i++)
            StdDraw.line(i - 1, a[i - 1], i, a[i]);
    }

    public static void plotBars(double[] a) {
        int n = a.length;
        StdDraw.setXscale(-1, n);
        for (int i = 0; i < n; i++)
            StdDraw.filledRectangle(i, a[i] / 2, 0.25, a[i] / 2);
    }

    public static void main(String[] args) {
        double[] a = StdArrayIO.readDouble1D();
        StdOut.printf("        min %7.3f\n", min(a));
        StdOut.printf("       mean %7.3f\n", mean(a));
        StdOut.printf("        max %7.3f\n", max(a));
        StdOut.printf("    std dev %7.3f\n", stddev(a));
    }
}
