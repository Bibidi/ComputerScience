public class AudioCollage {
    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    public static double[] amplify(double[] a, double alpha) {
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i] * alpha;
        }
        return b;
    }

    // Returns a new array that is the reverse of a[].
    public static double[] reverse(double[] a) {
        int len = a.length;
        double[] b = new double[len];
        for (int i = 0; i < len; i++) {
            b[i] = a[len - 1 - i];
        }
        return b;
    }

    // Returns a new array that is the concatenation of a[] and b[].
    public static double[] merge(double[] a, double[] b) {
        int n = a.length;
        int m = b.length;
        double[] c = new double[n + m];
        for (int i = 0; i < n + m; i++) {
            if (i < n) c[i] = a[i];
            else c[i] = b[i - n];
        }
        return c;
    }

    // Returns a new array that is the sum of a[] and b[],
    // padding the shorter arrays with trailing 0s if necessary.
    public static double[] mix(double[] a, double[] b) {
        int n = a.length;
        int m = b.length;
        int len = Integer.max(n, m);
        double[] c = new double[len];
        for (int i = 0; i < len; i++) {
            if (n > m) {
                if (i < m) c[i] = a[i] + b[i];
                else c[i] = a[i];
            }
            else {
                if (i < n) c[i] = a[i] + b[i];
                else c[i] = b[i];
            }
        }
        return c;
    }

    // Returns a new array that changes the speed by the given factor.
    public static double[] changeSpeed(double[] a, double alpha) {
        int n = (int) (a.length / alpha);
        double[] c = new double[n];
        for (int i = 0; i < n; i++) {
            c[i] = a[(int) (i * alpha)];
        }
        return c;
    }

    // Creates an audio collage and plays it on standard audio.
    // See below for the requirements.
    public static void main(String[] args) {
        double[] a = StdAudio.read("beatbox.wav");
        double[] b = StdAudio.read("buzzer.wav");
        double[] c = StdAudio.read("chimes.wav");
        double[] d = StdAudio.read("piano.wav");
        double[] e = StdAudio.read("singer.wav");

        StdAudio.play(amplify(a, 2));
        StdAudio.play(reverse(b));
        StdAudio.play(merge(c, d));
        StdAudio.play(mix(d, e));
        StdAudio.play(changeSpeed(d, 2));
    }
}
