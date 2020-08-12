public class RevesPuzzle {
    public static void reve(int n, char from, char to, char by, char ep) {
        if (n == 0) return;
        int k = (int) Math.round((double) n + 1 - Math.sqrt(2 * n + 1));
        reve(k, from, by, ep, to);
        hanoi(n, k, from, to, ep);
        reve(k, by, to, ep, from);
    }

    public static void hanoi(int n, int k, char from, char to, char by) {
        if (n == k) return;
        hanoi(n - 1, k, from, by, to);
        StdOut.printf("Move disc %d from %c to %c\n", n, from, to);
        hanoi(n - 1, k, by, to, from);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        reve(n, 'A', 'D', 'B', 'C');
    }
}
