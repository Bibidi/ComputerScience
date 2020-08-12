public class P03 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(args[i + 1]);
        }

        long[] b = new long[n];
        for (int i = 0; i < n; i++) {
            b[i] = Long.parseLong(args[i + n + 1]);
        }

        long inSqrt = 0;
        for (int i = 0; i < n; i++) {
            inSqrt += (a[i] - b[i]) * (a[i] - b[i]);
        }
        System.out.println(Math.sqrt(inSqrt));
    }
}
