public class RandomWalker {
    public static void main(String[] args) {
        long r = Long.parseLong(args[0]);

        long x = 0, y = 0;
        long steps = 0;
        System.out.println("(0, 0)");

        while (Math.abs(x) + Math.abs(y) < r) {
            int direction = (int) (Math.random() * 4.0);
            if (direction == 0) x -= 1;
            else if (direction == 1) y += 1;
            else if (direction == 2) x += 1;
            else y -= 1;
            System.out.println("(" + x + ", " + y + ")");
            steps++;
        }
        System.out.println("steps = " + steps);
    }
}
