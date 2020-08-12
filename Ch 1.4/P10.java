public class P10 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int SIZE = 52;

        String[] SUITS = { "Club", "Diamond", "Heart", "Spade" };
        String[] RANKS = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

        String[] DECKS = new String[SIZE];
        for (int i = 0; i < SUITS.length; i++) {
            for (int j = 0; j < RANKS.length; j++) {
                DECKS[13 * i + j] = SUITS[i] + "-" + RANKS[j];
            }
        }

        for (int i = 0; i < SIZE; i++) {
            int r = i + (int) (Math.random() * (SIZE - i));
            String t = DECKS[i];
            DECKS[i] = DECKS[r];
            DECKS[r] = t;
        }

        if (n <= 52) {
            for (int i = 0; i < n; i++) {
                if (i % 5 == 0) System.out.println();
                System.out.print(DECKS[i] + " ");
            }
        }
        else {
            System.out.println("Out of bounds");
        }
    }
}
