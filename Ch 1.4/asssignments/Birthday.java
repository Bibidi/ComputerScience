public class Birthday {
    public static void main(String[] args) {
        int days = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int[] count = new int[days + 2];
        for (int t = 0; t < trials; t++) {
            boolean[] birthday = new boolean[days];
            int p = 1;
            while (true) {
                int r = (int) (days * Math.random());
                if (birthday[r]) {
                    count[p]++;
                    break;
                }
                else {
                    birthday[r] = true;
                    p++;
                }
            }
        }

        for (int i = 1, s = 0; (double) s / trials < 0.5; i++) {
            s += count[i];
            System.out.println(i + "\t\t" + count[i] + "\t\t" + (double) s / trials);
        }
    }
}
