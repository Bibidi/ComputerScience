public class BandMatrix {
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        long distance = Long.parseLong(args[1]);

        for (long i = 1; i <= n; i++) {
            for (long j = 1; j <= n; j++) {
                if (Math.abs(i - j) <= distance) {
                    System.out.print("*  ");
                }
                else {
                    System.out.print("0  ");
                }
            }
            System.out.println();
        }
    }
}
