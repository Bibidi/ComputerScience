public class P02 {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        if (a < 1.0e-14) {
            if (b < 1.0e-14) {
                if (c < 1.0e-14)
                    System.out.println("All");
                else
                    System.out.println("NONE");
            }
            else {
                System.out.println(c / b);
            }
        }
        else {
            double discriminant = b * b - 4 * a * c;
            if (discriminant >= 0) {
                System.out.println((-b + Math.sqrt(discriminant)) / (2 * a));
                System.out.println((-b - Math.sqrt(discriminant)) / (2 * a));
            }
            else {
                System.out.println("NaN");
            }

        }
    }
}
