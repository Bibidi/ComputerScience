public class Inversions {
    // Return the number of inversions in the permutation a[].
    public static long count(int[] a) {
        long cnt = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) cnt++;
            }
        }
        return cnt;
    }

    // Return a permutation of length n with exactly k inversions.
    public static int[] generate(int n, long k) {
        int[] a = new int[n];
        int left = 0, right = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (k >= i) {
                a[left] = i;
                k -= i;
                left++;
            }
            else {
                a[right] = i;
                right--;
            }
        }
        return a;
    }

    // Takes an integer n and a long k as command-line arguments,
    // and prints a permutation of length n with exactly k inversions.
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        long k = Long.parseLong(args[1]);
        int[] a = generate(n, k);
        for (int i = 0; i < a.length; i++)
            StdOut.print(a[i] + " ");
    }
}
