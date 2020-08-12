public class P31 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int minNum = Math.min(i, j);
                boolean star = true;
                for (int factor = 2; factor <= minNum; factor++) {
                    if (i % factor == 0 && j % factor == 0) {
                        star = false;
                        break;
                    }
                }
                if (star) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
