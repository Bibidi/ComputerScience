public class P18 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / (i * i);
        }
        System.out.println(sum);

        sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1 / (1.0 * i * i);
        }
        System.out.println(sum);
    }
}
