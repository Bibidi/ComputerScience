public class P15 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = i * n + j;
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
            for (int j = i + 1; j < n; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                StdOut.printf("%4d", a[i][j]);
            }
            StdOut.println();
        }
    }
}
