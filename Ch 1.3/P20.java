public class P20 {
    public static void main(String[] args) {
        double n = Double.parseDouble(args[0]);
        double k = Double.parseDouble(args[1]);
        double EPSILON = 1e-14;
        double t = n;

        while (Math.abs(Math.pow(t, k) - n) > EPSILON) {
            t = t - (Math.pow(t, k) - n) / (k * Math.pow(t, k - 1));
        }
        System.out.println(t);
    }
}
