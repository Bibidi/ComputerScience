public class P16 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        for (int power = 2; power <= n; power *= 2) {
            System.out.println(power);
        }
    }
}
