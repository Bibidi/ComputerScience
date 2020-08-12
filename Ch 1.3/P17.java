public class P17 {
    public static void main(String[] args) {
        double p = Double.parseDouble(args[0]);
        double rates = Double.parseDouble(args[1]);
        int t = Integer.parseInt(args[2]);

        for (int i = 0; i <= t; i++) {
            System.out.println(p * Math.exp(rates * i));
        }
    }
}
