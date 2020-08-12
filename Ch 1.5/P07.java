public class P07 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] number = new boolean[n + 1];
        number[0] = true;

        for (int i = 0; i < n - 1; i++) {
            int x = StdIn.readInt();
            number[x] = true;
        }

        for (int i = 1; i <= n; i++) {
            if (!number[i])
                StdOut.println("Missing number: " + i);
        }
    }
}
