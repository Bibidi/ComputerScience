public class GreatCircle {
    public static void main(String[] args) {
        double x1, y1, x2, y2;
        x1 = Math.toRadians(Double.parseDouble(args[0]));
        y1 = Math.toRadians(Double.parseDouble(args[1]));
        x2 = Math.toRadians(Double.parseDouble(args[2]));
        y2 = Math.toRadians(Double.parseDouble(args[3]));
        double r = 6371.0;

        double inSqrt = Math.sin((x2 - x1) / 2) * Math.sin((x2 - x1) / 2)
                + Math.cos(x1) * Math.cos(x2) * Math.sin((y2 - y1) / 2) * Math.sin((y2 - y1) / 2);

        double distance = 2 * r * Math.asin(Math.sqrt(inSqrt));
        System.out.println(distance + " kilometers");
    }
}
