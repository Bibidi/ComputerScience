public class TwentyQuestions {
    public static void main(String[] args) {
        int secret = 1 + (int) (Math.random() * 1000000);
        StdOut.println("I'm Thinking of a number between 1 and 1,000,000");
        int guess = 0;
        while (guess != secret) {
            StdOut.print("What's your guess? ");
            guess = StdIn.readInt();
            if (guess == secret) StdOut.println("You win!");
            else if (guess < secret) StdOut.println("Too low");
            else StdOut.println("Too high");
        }
    }
}
