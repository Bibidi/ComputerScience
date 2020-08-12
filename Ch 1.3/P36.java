public class P36 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int count = 0;
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int factor = 2; factor <= i / factor; factor++) {
                if (i % factor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) count++;
        }
        System.out.println(count);
    }
}
