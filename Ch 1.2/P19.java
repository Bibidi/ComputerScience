public class P19 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        double dist = Math.random() * (b - a + 1);
        System.out.println(a + (int) dist);
    }
}
