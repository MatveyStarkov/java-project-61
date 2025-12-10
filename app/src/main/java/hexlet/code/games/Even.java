package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;


public class Even {
    public static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MAX_NUMBER = 99;

    public static void evenGame() {
        Random random = new Random();
        String[][] rounds = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int num = random.nextInt(MAX_NUMBER) + 1;
            String question = String.valueOf(num);
            String correctAnswer = (num % 2 == 0) ? "yes" : "no";
            rounds[i][0] = question;
            rounds[i][1] = correctAnswer;
        }
        Engine.run(DESCRIPTION, rounds);
    }
}

