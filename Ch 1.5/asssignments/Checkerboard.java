public class Checkerboard {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setScale(0, n);
        double r = 1.0 / 2.0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                double x = (double) (2 * j + 1) / 2.0;
                double y = (double) (2 * i + 1) / 2.0;
                if ((i + j) % 2 == 0) StdDraw.setPenColor(StdDraw.BLUE);
                else StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
                StdDraw.filledSquare(x, y, r);
            }
        }
    }
}
