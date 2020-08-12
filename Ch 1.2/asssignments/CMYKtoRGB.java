public class CMYKtoRGB {
    public static void main(String[] args) {
        double c, m, y, b, w;
        c = Double.parseDouble(args[0]);
        m = Double.parseDouble(args[1]);
        y = Double.parseDouble(args[2]);
        b = Double.parseDouble(args[3]);
        w = 1.0 - b;

        int red, green, blue;
        red = (int) (Math.round(255 * w * (1 - c)));
        green = (int) (Math.round(255 * w * (1 - m)));
        blue = (int) (Math.round(255 * w * (1 - y)));

        System.out.println("red   = " + red);
        System.out.println("green = " + green);
        System.out.println("blue  = " + blue);
    }
}
