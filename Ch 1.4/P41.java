public class P41 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        double[][] binomial = new double[n + 1][0];

        binomial[1] = new double[1 + 2];
        binomial[1][1] = 1.0;

        for (int i = 2; i <= n; i++) {
            binomial[i] = new double[i + 2];
            for (int k = 1; k <= i; k++) {
                binomial[i][k] = 0.5 * (binomial[i - 1][k] + binomial[i - 1][k - 1]);
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(binomial[i][j] + " ");
            }
            System.out.println();
        }
    }
}
