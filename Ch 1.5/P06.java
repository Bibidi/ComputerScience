public class P06 {
    public static void main(String[] args) {
        int prior = StdIn.readInt();
        StdOut.print(prior + " ");

        while (!StdIn.isEmpty()) {
            int cur = StdIn.readInt();
            if (cur == prior) continue;
            StdOut.print(cur + " ");
            prior = cur;
        }
    }
}
