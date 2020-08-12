public class P32 {
    public static void main(String[] args) {
        int red = Integer.parseInt(args[0]);
        int blue = Integer.parseInt(args[1]);
        int green = Integer.parseInt(args[2]);

        double w = Math
                .max((double) red / 255.0, Math.max((double) blue / 255.0, (double) green / 255.0));
        double c = (w - (double) red / 255.0) / w;
        double m = (w - (double) green / 255.0) / w;
        double y = (w - (double) blue / 255.0) / w;
        double k = 1 - w;

        System.out.println("C : " + c);
        System.out.println("M : " + m);
        System.out.println("Y : " + y);
        System.out.println("K : " + k);
    }
}
