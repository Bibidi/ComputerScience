public class RandomWalkers {
    public static void main(String[] args) {
        long r = Long.parseLong(args[0]);
        long trials = Long.parseLong(args[1]);

        long sum = 0;
        for (long i = 1; i <= trials; i++) {
            long x = 0, y = 0;
            long steps = 0;
            while (Math.abs(x) + Math.abs(y) < r) {
                int direction = (int) (Math.random() * 4);
                if (direction == 0) x--;
                else if (direction == 1) y++;
                else if (direction == 2) x++;
                else y--;
                steps++;
            }
            sum += steps;
        }
        System.out.println("average number of steps = " + (double) sum / trials);
    }
}
