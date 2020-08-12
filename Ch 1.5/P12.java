public class P12 {
    public static void main(String[] args) {
        String sformat = "%8s %8s %8s %8s";
        StdOut.printf(sformat, "Name", "Integer", "Integer", "Result");

        String format = "%8s %8d %8d %8.3f";
        while (!StdIn.isEmpty()) {
            String name = StdIn.readString();
            int n1 = StdIn.readInt();
            int n2 = StdIn.readInt();
            double r = (double) n1 / n2;
            StdOut.printf(format, name, n1, n2, r);
        }
    }
}
