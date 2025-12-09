package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {

    public static final String DESCRIPTION = "What number is missing in the progression?";
    private static final int TOTAL_ROUNDS = 3;
    private static final int MAX_START = 10;
    private static final int MAX_STEP = 10;
    private static final int PROGRESSION_LENGTH = 10;

    private static String[] build(int start, int step, int length) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i++) {
            int x = start + i * step;
            progression[i] = String.valueOf(x);
        }
        return progression;
    }

    public static void progressionGame() {
        Random random = new Random();
        String[][] rounds = new String[TOTAL_ROUNDS][2];

        for (int i = 0; i < TOTAL_ROUNDS; i++) {
            int start = random.nextInt(MAX_START) + 1;
            int step = random.nextInt(MAX_STEP) + 1;
            int length = PROGRESSION_LENGTH;
            String[] progression = build(start, step, length);
            int hidden = random.nextInt(length);
            String correct = progression[hidden];
            progression[hidden] = "..";
            String question = String.join(" ", progression);
            rounds[i][0] = question;
            rounds[i][1] = correct;
        }
        Engine.run(DESCRIPTION, rounds);
    }
}
