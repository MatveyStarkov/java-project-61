package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;


    public static void run(String game, String[][] rounds) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(game);
        for (String[] round : rounds) {
            String question = round[0];
            String correctAnswer = round[1];

            System.out.println("Question: " + question);
            System.out.print("Answer: ");
            String userAnswer = scanner.next();

            if (!userAnswer.equals(correctAnswer)) {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was "
                        + correctAnswer + "\nLet's try again, " + name + "!");
                return;
            }

            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + name + "!");
    }
}
