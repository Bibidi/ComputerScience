public class P31 {
    public static void main(String[] args) {
        double la0 = Double.parseDouble(args[0]);
        double la = Double.parseDouble(args[1]);
        double lo = Double.parseDouble(args[2]);

        double x = la - la0;
        double y = (1.0 / 2.0) * Math.log((1 + Math.sin(lo)) / (1 - Math.sin(lo)));
        System.out.println("(" + x + ", " + y + ")");
    }
}
