public class StdArrayIO2 {
    public static double[] readDouble1D() {
        int n = StdIn.readInt();
        double[] a = new double[n];
        for (int i = 0; i < n; i++)
            a[i] = StdIn.readDouble();
        return a;
    }

    public static double[][] readDouble2D() {
        int m = StdIn.readInt();
        int n = StdIn.readInt();
        double[][] a = new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = StdIn.readDouble();
            }
        }
        return a;
    }

    public static void print(double[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            StdOut.printf("9.5f ", a[i]);
        }
    }

    public static void print(double[][] a) {
        int m = a.length;
        int n = a[0].length;
        StdOut.println(m + " " + n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                StdOut.printf("%9.5f ", a[i][j]);
            }
            StdOut.println();
        }
        StdOut.println();
    }

    public static void main(String[] args) {
        print(readDouble2D());
    }
}
