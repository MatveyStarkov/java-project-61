package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeGame() {
        Random random = new Random();
        String[][] rounds = new String[3][2];

        for (int i = 0; i < 3; i++) {
            int num = random.nextInt(9) + 1;
            String question = String.valueOf(num);
            String correct = isPrime(num) ? "yes" : "no";

            rounds[i][0] = question;
            rounds[i][1] = correct;
        }

        String gameQuestion = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.run(gameQuestion, rounds);
    }
}
