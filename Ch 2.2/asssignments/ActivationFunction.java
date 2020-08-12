public class ActivationFunction {

    // Returns the Heaviside function of x.
    public static double heaviside(double x) {
        if (Double.isNaN(x)) return Double.NaN;
        if (x < 0) return 0;
        else if (x == 0) return 0.5;
        else return 1.0;
    }

    // Returns the sigmoid function of x.
    public static double sigmoid(double x) {
        if (Double.isNaN(x)) return Double.NaN;
        return 1.0 / (1.0 + Math.exp(-x));
    }

    // Returns the hyperbolic tangent of x.
    public static double tanh(double x) {
        if (Double.isNaN(x)) return Double.NaN;
        if (x >= 20) return 1.0;
        if (x <= -20) return -1.0;
        return (Math.exp(x) - Math.exp(-x)) / (Math.exp(x) + Math.exp(-x));
    }

    // Returns the softsign function of x.
    public static double softsign(double x) {
        if (Double.isNaN(x)) return Double.NaN;
        if (x == Double.POSITIVE_INFINITY) return 1.0;
        if (x == Double.NEGATIVE_INFINITY) return -1.0;
        return x / (1.0 + Math.abs(x));
    }

    // Returns the square nonlinearity function of x.
    public static double sqnl(double x) {
        if (Double.isNaN(x)) return Double.NaN;
        if (x <= -2) return -1.0;
        else if (x < 0) return x + x * x / 4.0;
        else if (x < 2) return x - x * x / 4.0;
        else return 1.0;
    }

    // Takes a double command-line argument x and prints each activation
    // function, evaluated, in the format (and order) given below.
    public static void main(String[] args) {
        double n = Double.parseDouble(args[0]);
        StdOut.printf("heaviside(%f) = %.16f\n", n, heaviside(n));
        StdOut.printf("  sigmoid(%f) = %.16f\n", n, sigmoid(n));
        StdOut.printf("     tanh(%f) = %.16f\n", n, tanh(n));
        StdOut.printf(" softsign(%f) = %.16f\n", n, softsign(n));
        StdOut.printf("     sqnl(%f) = %.16f\n", n, sqnl(n));
    }
}
