public class TrinomialDP {
    public static long trinomial(int n, int k) {
        if (k < -n || k > n) return 0;
        long[][] t = new long[n + 1][2 * n + 1];
        t[0][n] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j <= n + i; j++) {
                if (i == j - n) t[i][j] = 1;
                else {
                    if (j != 0) t[i][j] += t[i - 1][j - 1];
                    t[i][j] += t[i - 1][j];
                    if (j != 2 * n) t[i][j] += t[i - 1][j + 1];
                }
            }
        }
        return t[n][k + n];
    }

    // Takes two integer command-line arguments n and k and prints T(n, k).
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        StdOut.println(trinomial(n, k));
    }
}
