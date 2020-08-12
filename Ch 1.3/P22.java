public class P22 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        /*
        String s = "";
        int power = 1;
        while (power <= n / 2) power *= 2;
        while (power > 0) {
            if (n < power) s += 0;
            else {
                s += 1;
                n -= power;
            }
            power /= 2;
        }
         */

        String s = "";
        while (n > 0) {
            s = (n % 2) + s;
            n /= 2;
        }
        System.out.println(s);
    }
}
