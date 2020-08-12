public class ThreeSum {
    public static void printTriples(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[i] + a[j] + a[k] == 0)
                        StdOut.printf("%5d %5d %5d\n", a[i], a[j], a[k]);
                }
            }
        }
    }

    public static int countTriples(int[] a) {
        int n = a.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[i] + a[j] + a[k] == 0)
                        count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = StdIn.readAllInts();
        Stopwatch timer = new Stopwatch();
        int count = countTriples(a);
        StdOut.printf("%d (%.0f seconds)\n", count, timer.elapsedTime());
        if (count < 10) printTriples(a);
    }
}
