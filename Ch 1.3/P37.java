public class P37 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int y = n;
        int x = n;
        int count = 0;
        while (y > 0 && y < 2 * n && x > 0 && x < 2 * n) {
            if (Math.random() < 0.25) x--;
            else if (Math.random() < 0.5) y++;
            else if (Math.random() < 0.75) x++;
            else y--;
            count++;
        }
        System.out.println(count);
    }
}
