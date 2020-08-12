public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        int power = 1;
        while (power < n) power *= 2;

        boolean[] a = new boolean[power];
        for (int i = 1; i <= power / 2; i *= 2) {
            for (int j = i; j < i * 2; j++) {
                a[j] = !a[j - i];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j]) System.out.print("+  ");
                else System.out.print("-  ");
            }
            System.out.println();
        }
    }
}
