public class P10 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            double temp = Math.random();
            sum += temp;
            System.out.println(temp);
        }
        System.out.println("average : " + sum / n);
    }
}
