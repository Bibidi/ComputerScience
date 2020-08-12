public class P05 {
    public static void main(String[] args) {
        int run = StdIn.readInt();
        int len = 1;
        int maxLen = 1;
        int prior = run;
        while (!StdIn.isEmpty()) {
            int x = StdIn.readInt();

            if (x == prior) len++;
            else len = 1;

            if (len > maxLen) {
                run = x;
                maxLen = len;
            }
            prior = x;
        }
        String format = "Longest run: %d consecutive %d";
        if (maxLen > 1) format += "s";
        StdOut.printf(format, maxLen, run);
    }
}
