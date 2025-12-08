package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;


public class Even {
    public static void evenGame() {
        Random random = new Random();
        String[][] roundsData = new String[3][2];
        for (int i = 0; i < 3; i++) {
            int num = random.nextInt(99) + 1;  // от 1 до 99
            String question = String.valueOf(num);
            String correctAnswer;
            if (num % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            roundsData[i][0] = question;
            roundsData[i][1] = correctAnswer;
        }
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'";
        Engine.run(description, roundsData);
    }
}

