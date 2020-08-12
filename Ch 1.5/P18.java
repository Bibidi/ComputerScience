public class P18 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double r = 1.0 / 2.0 / n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                double x = (double) (2 * j + 1) / 2.0 / n;
                double y = (double) (2 * i + 1) / 2.0 / n;
                if ((i + j) % 2 == 0) StdDraw.setPenColor(StdDraw.RED);
                else StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.filledSquare(x, y, r);
            }
        }
    }
}
