public class ShapeAndText {
    public static void main(String[] args) {
        StdDraw.square(0.2, 0.8, 0.1);
        StdDraw.filledSquare(0.8, 0.8, 0.2);
        StdDraw.circle(0.8, 0.2, 0.2);
        double[] xd = { 0.1, 0.2, 0.3, 0.2 };
        double[] yd = { 0.2, 0.3, 0.2, 0.1 };
        StdDraw.filledPolygon(xd, yd);
        StdDraw.text(0.2, 0.5, "black text");
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.8, 0.8, "white text");
    }
}
