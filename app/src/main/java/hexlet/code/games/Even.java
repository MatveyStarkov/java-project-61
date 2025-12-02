package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void evenGame() {
        System.out.println("Welcome to the Brain Games");
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        int questions = 3;
        int i = 0;
        String correctAnswer;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");
        Random random = new Random();
        while (i < questions) {
            int num = random.nextInt(99) + 1;
            System.out.println("Question: " + num);
            if (num % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            System.out.print("Answer: ");
            String answer = scanner.next();
            if (!answer.equals(correctAnswer)) {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + correctAnswer + "\n"
                        + "Let's try again, " + name + "!");
                break;
            } else {
                System.out.println("Correct!");
            }
            i++;
        }
        if (i == questions) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
