package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Gcd {
    public static void gcdGame() {
        System.out.println("Welcome to the Brain Games");
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        Random random = new Random();
        int questions = 3;
        int i = 0;
        System.out.println("Find the greatest common divisor of given numbers.");
        while (i < questions){
            int num1 = random.nextInt(10);
            int num2 = random.nextInt(10);
            int correct = 0;
            System.out.println("Question: " + num1 + " " + num2);
            while (num2 != 0) {
                int ostatok = num1 % num2;
                num1 = num2;
                num2 = ostatok;
            }
            correct = num1;
            System.out.print("Answer: ");
            int answer = scanner.nextInt();
            if (answer == correct) {
                System.out.println("Correct!");
            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + correct + "\n"
                        + "Let's try again, " + name + "!");
                break;
            }
            i++;
        }
        if (i == questions) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
