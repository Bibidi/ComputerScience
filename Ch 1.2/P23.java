public class P23 {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);

        boolean res = (m == 3 && d >= 20 && d <= 31);
        res = res || (m == 4 && d >= 1 && d <= 30);
        res = res || (m == 5 && d >= 1 && d <= 31);
        res = res || (m == 6 && d >= 1 && d <= 20);

        System.out.println(res);
    }
}
