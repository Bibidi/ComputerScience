public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);

        long[] a = new long[args.length];
        for (int i = 1; i < a.length; i++) {
            a[i] = Integer.parseInt(args[i]);
        }

        long[] s = new long[args.length];
        for (int i = 1; i < s.length; i++) {
            s[i] = s[i - 1] + a[i];
        }

        for (int i = 1; i <= m; i++) {
            long p = (int) (Math.random() * s[s.length - 1]);
            for (int j = 1; j < s.length; j++) {
                if (s[j - 1] <= p && p < s[j]) {
                    System.out.print(j + " ");
                    break;
                }
            }
            if (i % 25 == 0) System.out.println();
        }
    }
}
