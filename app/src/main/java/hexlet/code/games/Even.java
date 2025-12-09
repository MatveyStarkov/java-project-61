package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;


public class Even {
    public static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int TOTAL_ROUNDS = 3;
    private static final int MAX_NUMBER = 99;

    public static void evenGame() {
        Random random = new Random();
        String[][] rounds = new String[TOTAL_ROUNDS][2];
        for (int i = 0; i < TOTAL_ROUNDS; i++) {
            int num = random.nextInt(MAX_NUMBER) + 1;  // от 1 до 99
            String question = String.valueOf(num);
            String correctAnswer = (num % 2 == 0) ? "yes" : "no";
            rounds[i][0] = question;
            rounds[i][1] = correctAnswer;
        }
        Engine.run(DESCRIPTION, rounds);
    }
}

