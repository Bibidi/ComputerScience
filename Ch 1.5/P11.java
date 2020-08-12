public class P11 {
    public static void main(String[] args) {
        int n = 0;
        while (!StdIn.isEmpty()) {
            String str = StdIn.readString();
            n++;
        }
        StdOut.println(n);
    }
}
