public class P27 {
    public static void main(String[] args) {
        double u = Math.random();
        double v = Math.random();

        double PI = Math.PI;
        double gaussian = Math.sin(2 * PI * v) * Math.sqrt((-2) * Math.log(u));
        System.out.println(gaussian);
    }
}
