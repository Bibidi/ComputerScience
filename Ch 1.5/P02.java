public class P02 {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (!StdIn.isEmpty()) {
            int x = StdIn.readInt();
            if (x <= 0) {
                System.out.println("Enter only positive integers.");
                continue;
            }
            if (x < min) min = x;
            if (x > max) max = x;
        }
        System.out.println("MIN: " + min);
        System.out.println("MAX: " + max);
    }
}
