public class P32 {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        char[][] map = new char[m][n];
        int mines = 0;
        while (mines < k) {
            int ret = (int) (Math.random() * m * n);
            int i = ret / n;
            int j = ret % n;
            if (map[i][j] == '*') continue;
            else {
                map[i][j] = '*';
                mines++;
            }
        }

        int[] dy = { -1, -1, -1, 0, 0, 1, 1, 1 };
        int[] dx = { -1, 0, 1, -1, 1, -1, 0, 1 };

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == '*') continue;
                int around = 0;
                for (int direction = 0; direction < dy.length; direction++) {
                    int nextY = i + dy[direction];
                    int nextX = j + dx[direction];
                    if (nextY >= 0 && nextY < m && nextX >= 0 && nextX < n) {
                        if (map[nextY][nextX] == '*')
                            around++;
                    }
                }
                map[i][j] = (char) ('0' + around);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(map[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
