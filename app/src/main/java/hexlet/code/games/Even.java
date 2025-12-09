package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;


public class Even {
    public static void evenGame() {
        Random random = new Random();
        String[][] rounds = new String[3][2];
        for (int i = 0; i < 3; i++) {
            int num = random.nextInt(99) + 1;  // от 1 до 99
            String question = String.valueOf(num);
            String correctAnswer = (num % 2 == 0) ? "yes" : "no";
//            if (num % 2 == 0) {
//                correctAnswer = "yes";
//            } else {
//                correctAnswer = "no";
//            }
            rounds[i][0] = question;
            rounds[i][1] = correctAnswer;
        }
        String gameQuestion = "Answer 'yes' if the number is even, otherwise answer 'no'";
        Engine.run(gameQuestion, rounds);
    }
}

