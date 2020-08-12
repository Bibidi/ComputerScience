public class GeneralizedHarmonic {
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        long r = Long.parseLong(args[1]);

        double sum = 0.0;
        for (long i = 1; i <= n; i++) {
            sum += 1.0 / Math.pow(i, r);
        }
        System.out.println(sum);
    }
}
