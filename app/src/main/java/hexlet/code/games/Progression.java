package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    private static int[] build(int start, int step, int length) {
        int[] progression = new int[length];
        for (int i = 0; i < length; i++) {
            progression[i] = start + i * step;
        }
        return progression;
    }

    public static void progressionGame() {
        Random random = new Random();
        String[][] rounds = new String[3][2];

        for (int i = 0; i < 3; i++) {
            int start = random.nextInt(10) + 1;
            int step = random.nextInt(10) + 1;
            int length = 10;
            int[] progression = build(start, step, length);
            int hidden = random.nextInt(length);
            int correct = progression[hidden];
            StringBuilder questionBuilder = new StringBuilder();
            for (int j = 0; j < length; j++) {
                if (j == hidden) {
                    questionBuilder.append("..");
                } else {
                    questionBuilder.append(progression[j]);
                }
                if (j < length - 1) {
                    questionBuilder.append(" ");
                }
            }
            String question = questionBuilder.toString();
            rounds[i][0] = question;
            rounds[i][1] = String.valueOf(correct);
        }

        String description = "What number is missing in the progression?";
        Engine.run(description, rounds);
    }
}
