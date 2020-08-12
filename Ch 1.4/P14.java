public class P14 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = i * n + j;
            }
        }

        int[][] b = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = a[j][i];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                StdOut.printf("%4d", a[i][j]);
            }
            StdOut.println();
        }

        StdOut.println();
        StdOut.println("------- After -----------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                StdOut.printf("%4d", b[i][j]);
            }
            StdOut.println();
        }
    }
}
