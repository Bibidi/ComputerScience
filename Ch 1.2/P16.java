public class P16 {
    public static void main(String[] args) {
        // correct answer
        double G = 9.8;
        double mass1 = Double.parseDouble(args[0]);
        double mass2 = Double.parseDouble(args[1]);
        double r = Double.parseDouble(args[2]);

        double force = (G * mass1 * mass2) / (r * r);
        System.out.println(force);
    }
}
