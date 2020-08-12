public class P13 {
    public static void main(String[] args) {
        int m = (int) (100 * Math.random());

        int[][] a = new int[m][];
        for (int i = 0; i < m; i++) {
            int n = (int) (10 * Math.random());
            a[i] = new int[n];
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (1000 * Math.random());
            }
        }

        int[][] b = new int[a.length][];
        for (int i = 0; i < a.length; i++) {
            b[i] = new int[a[i].length];
            for (int j = 0; j < a[i].length; j++) {
                b[i][j] = a[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
            System.out.println();
        }
    }
}
