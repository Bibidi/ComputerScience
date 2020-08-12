public class RightTriangle {
    public static void main(String[] args) {
        long a = Integer.parseInt(args[0]);
        long b = Integer.parseInt(args[1]);
        long c = Integer.parseInt(args[2]);

        boolean result = (a * a == b * b + c * c);
        result = result || (b * b == a * a + c * c);
        result = result || (c * c == a * a + b * b);
        result = result && (a > 0 && b > 0 && c > 0);
        System.out.println(result);
    }
}
