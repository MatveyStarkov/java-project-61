package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {

    public static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int TOTAL_ROUNDS = 3;
    private static final int MAX_NUMBER = 9;


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
        String[][] rounds = new String[TOTAL_ROUNDS][2];

        for (int i = 0; i < TOTAL_ROUNDS; i++) {
            int num = random.nextInt(MAX_NUMBER) + 1;
            String question = String.valueOf(num);
            String correct = isPrime(num) ? "yes" : "no";

            rounds[i][0] = question;
            rounds[i][1] = correct;
        }

        Engine.run(DESCRIPTION, rounds);
    }
}
