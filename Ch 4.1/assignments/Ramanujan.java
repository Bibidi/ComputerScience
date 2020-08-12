public class Ramanujan {
    // Is n a Ramanujan number?
    public static boolean isRamanujan(long n) {
        int cnt = 0;
        for (long a = 1; a * a <= n / a; a++) {
            long b = (long) Math.cbrt(n - a * a * a);
            if (a > b) break;
            if (a * a * a + b * b * b == n) {
                cnt++;
                if (cnt >= 2) break;
            }
        }
        return cnt >= 2;
    }

    // Takes a long integer command-line arguments n and prints true if
    // n is a Ramanujan number, and false otherwise.
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        StdOut.println(isRamanujan(n));
    }
}
