public class P24 {
    public static void main(String[] args) {
        double p = Double.parseDouble(args[0]);
        double rates = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);

        double res = p * Math.exp(rates * t);
        System.out.println(res);
    }
}
