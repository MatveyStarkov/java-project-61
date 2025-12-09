package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;


public class Calc {
    public static final String DESCRIPTION = "What is the result of the expression?";

    public static int calculate(char op, int num1, int num2) {
        switch (op) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            default:
                System.out.println("Wrong operation");
                return 0;
        }
    }

    public static void calcGame() {
        Random random = new Random();
        String[][] rounds = new String[3][2];
        char[] operators = {'+', '-', '*'};
        for (int i = 0; i < 3; i++) {
            int num1 = random.nextInt(10);
            int num2 = random.nextInt(10);
            int index = random.nextInt(operators.length); // 0..2
            char op = operators[index];
            String question = num1 + " " + op + " " + num2;

            int correct = calculate(op, num1, num2);

            rounds[i][0] = question;                  // вопрос
            rounds[i][1] = String.valueOf(correct);
        }
        Engine.run(DESCRIPTION, rounds);
    }
}
