public class P17 {
    public static void main(String[] args) {
        int n = 0;
        double prior = 0.0;
        double magnitude = 0.0;
        double power = 0.0;
        int crossing = 0;
        while (!StdIn.isEmpty()) {
            double x = StdIn.readDouble();
            magnitude += Math.abs(x);
            power += x * x;
            if (prior / x < 0) crossing++;
            prior = x;
            n++;
        }
        StdOut.println("Average magnitude: " + magnitude / n);
        StdOut.println("Average Power: " + power / n);
        StdOut.println("Zero rossings: " + crossing);
    }
}
