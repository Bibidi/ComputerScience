public class MaximumSquareSubmatrix {

    // Returns the size of the largest contiguous square submatrix
    // of a[][] containing only 1s.
    public static int size(int[][] a) {
        int[][] b = new int[a.length][a.length];
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i][0] == 1) {
                b[i][0] = 1;
                max = 1;
            }
        }

        for (int j = 0; j < a.length; j++) {
            if (a[0][j] == 1) {
                b[0][j] = 1;
                max = 1;
            }
        }

        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                if (a[i][j] == 1)
                    b[i][j] = 1 + Math.min(Math.min(b[i - 1][j - 1], b[i - 1][j]), b[i][j - 1]);
                else b[i][j] = 0;
                if (b[i][j] > max) max = b[i][j];
            }
        }
        return max;
    }

    // Reads an n-by-n matrix of 0s and 1s from standard input
    // and prints the size of the largest contiguous square submatrix
    // containing only 1s.
    public static void main(String[] args) {
        int n = StdIn.readInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = StdIn.readInt();
            }
        }
        StdOut.println(size(a));
    }
}
