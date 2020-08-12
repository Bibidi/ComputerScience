public class ShannonEntropy {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] a = new int[m + 1];
        int count = 0;
        while (!StdIn.isEmpty()) {
            int x = StdIn.readInt();
            if (x > 0 && x <= m) {
                a[x]++;
                count++;
            }
        }
        double h = 0.0;
        for (int i = 1; i <= m; i++) {
            if (a[i] == 0) continue;
            double p = (double) a[i] / count;
            h -= p * Math.log(p) / Math.log(2);
        }
        System.out.printf("%.4f", h);
    }
}
