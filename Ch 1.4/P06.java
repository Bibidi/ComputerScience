public class P06 {
    public static void main(String[] args) {
        int n = 100;
        boolean[][] a = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                double r = Math.random();
                if (r < 0.5) a[i][j] = true;
                else a[i][j] = false;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j]) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
