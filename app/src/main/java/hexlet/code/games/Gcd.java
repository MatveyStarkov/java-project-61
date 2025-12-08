package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Gcd {
    public static void gcdGame() {
        Random random = new Random();
        String[][] rounds = new String[3][2];
        for (int i = 0; i < 3; i++) {
            int num1 = random.nextInt(10) + 1; // можно +1, чтобы избежать 0
            int num2 = random.nextInt(10) + 1;
            String question = num1 + " " + num2;
            int a = num1;
            int b = num2;
            while (b != 0) {
                int remainder = a % b;
                a = b;
                b = remainder;
            }
            int correct = a;
            rounds[i][0] = question;
            rounds[i][1] = String.valueOf(correct);
        }
        String gameQuestion = "Find the greatest common divisor of given numbers.";
        Engine.run(gameQuestion, rounds);
    }
}
