public class RandomSurfer {
    public static void main(String[] args) {
        StdDraw.enableDoubleBuffering();

        int trials = Integer.parseInt(args[0]);
        int n = StdIn.readInt();
        StdIn.readInt();
        StdDraw.setXscale(-1, n);
        StdDraw.setYscale(0, trials);

        double[][] p = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                p[i][j] = StdIn.readDouble();
            }
        }

        int page = 0;
        int[] freq = new int[n];
        for (int t = 0; t < trials; t++) {
            double r = Math.random();
            double sum = 0.0;
            for (int j = 0; j < n; j++) {
                sum += p[page][j];
                if (r < sum) {
                    page = j;
                    break;
                }
            }
            freq[page]++;

            StdDraw.clear();
            for (int k = 0; k < n; k++) {
                StdDraw.filledRectangle(k, freq[k] / 2.0, 0.25, freq[k] / 2.0);
            }
            StdDraw.show();
            StdDraw.pause(5);
        }

        for (int i = 0; i < n; i++) {
            StdOut.printf("%8.5f", (double) freq[i] / trials);
        }
        StdOut.println();
    }
}
