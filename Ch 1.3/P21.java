public class P21 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);

        int power = 1;
        while (power <= n / k) {
            power *= k;
        }

        while (power > 0) {
            int digit = n / power;

            if (digit < 10) System.out.print(digit);
            else if (digit == 10) System.out.print('A');
            else if (digit == 11) System.out.print('B');
            else if (digit == 12) System.out.print('C');
            else if (digit == 13) System.out.print('D');
            else if (digit == 14) System.out.print('E');
            else System.out.print('F');

            n -= power * digit;
            power /= k;
        }
    }
}
