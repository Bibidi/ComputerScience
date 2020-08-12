public class P34 {
    public static void main(String[] args) {
        int x1 = Integer.parseInt(args[0]);
        int x2 = Integer.parseInt(args[1]);
        int x3 = Integer.parseInt(args[2]);

        int first = Math.min(x1, Math.min(x2, x3));
        int third = Math.max(x1, Math.max(x2, x3));
        int second = x1 + x2 + x3 - first - third;

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}
