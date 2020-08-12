public class Sketch {
    private final Vector profile;

    public Sketch(String text, int k, int d) {
        int n = text.length();
        double[] freq = new double[d];
        for (int i = 0; i < n - k - 1; i++) {
            String kgram = text.substring(i, i + k);
            int hash = kgram.hashCode();
            freq[Math.abs(hash % d)]++;
        }
        Vector vector = new Vector(freq);
        profile = vector.direction();
    }

    public double similarTo(Sketch other) {
        return profile.dot(other.profile);
    }

    public String toString() {
        String ret = "(";
        int len = profile.size();
        for (int i = 0; i < len - 1; i++) {
            ret += profile.cartesian(i) + ", ";
        }
        ret += profile.cartesian(len - 1) + ")";
        return ret;
    }

    public static void main(String[] args) {
        int k = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        String text = StdIn.readAll();
        Sketch sketch = new Sketch(text, k, d);
        StdOut.println(sketch);
    }
}