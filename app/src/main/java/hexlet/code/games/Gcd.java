package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Gcd {
    public static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    private static final int TOTAL_ROUNDS = 3;
    private static final int MAX_NUMBER = 10;

    private static int gcd(int num1, int num2) {
        int a = num1;
        int b = num2;
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public static void gcdGame() {
        Random random = new Random();
        String[][] rounds = new String[TOTAL_ROUNDS][2];
        for (int i = 0; i < 3; i++) {
            int num1 = random.nextInt(MAX_NUMBER) + 1; // можно +1, чтобы избежать 0
            int num2 = random.nextInt(MAX_NUMBER) + 1;
            String question = num1 + " " + num2;
            int correct = gcd(num1, num2);
            rounds[i][0] = question;
            rounds[i][1] = String.valueOf(correct);
        }

        Engine.run(DESCRIPTION, rounds);
    }
}
