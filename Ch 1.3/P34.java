public class P34 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int a = 1; a * a * a <= n; a++)
            for (int b = a + 1; b * b * b <= n; b++)
                for (int c = 1; c * c * c <= n; c++)
                    for (int d = c + 1; d * d * d <= n; d++) {
                        if (a < c && a * a * a + b * b * b == c * c * c + d * d * d) {
                            System.out.println(
                                    a + ", " + b + ", " + c + ", " + d + " - " + (a * a * a
                                            + b * b * b));
                        }
                    }
    }
}
