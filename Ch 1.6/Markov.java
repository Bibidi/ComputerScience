public class Markov {
    public static void main(String[] args) {
        int trials = Integer.parseInt(args[0]);
        int n = StdIn.readInt();
        StdIn.readInt();

        double[][] p = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                p[i][j] = StdIn.readDouble();
            }
        }

        double[] ranks = new double[n];
        ranks[0] = 1.0;
        for (int t = 0; t < trials; t++) {
            double[] newRanks = new double[n];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    newRanks[j] += ranks[k] * p[k][j];
                }
            }

            for (int j = 0; j < n; j++)
                ranks[j] = newRanks[j];
        }

        StdDraw.enableDoubleBuffering();
        StdDraw.setXscale(-1, n);
        StdDraw.setYscale(0, trials);
        for (int i = 0; i < n; i++) {
            StdDraw.filledRectangle(i, trials * ranks[i] / 2.0, 0.25, trials * ranks[i] / 2.0);
        }
        StdDraw.show();

        for (int i = 0; i < n; i++)
            StdOut.printf("%8.5f", ranks[i]);
        StdOut.println();
    }
}
