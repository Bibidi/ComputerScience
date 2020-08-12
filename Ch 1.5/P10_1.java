public class P10_1 {
    public static void main(String[] args) {
        int n = 0;
        while (!StdIn.isEmpty()) {
            int x = StdIn.readInt();
            StdOut.printf("%4d", x);
            n++;
            if (n % 10 == 0) StdOut.println();
        }
    }
}
