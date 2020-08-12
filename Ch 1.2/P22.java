public class P22 {
    public static void main(String[] args) {
        double x0 = Double.parseDouble(args[0]);
        double v0 = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);
        double g = 9.80665;

        double result = x0 + v0 * t - (g * t * t) / 2.0;
        System.out.println(result);
    }
}
