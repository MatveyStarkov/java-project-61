package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;


public class Calc {
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
            int correct = 0;
            switch (op) {
                case '+':
                    correct = num1 + num2;
                    break;
                case '-':
                    correct = num1 - num2;
                    break;
                case '*':
                    correct = num1 * num2;
                    break;
                default:
                    break;
            }
            rounds[i][0] = question;                  // вопрос
            rounds[i][1] = String.valueOf(correct);
        }

        String question = "What is the result of the expression?";
        Engine.run(question, rounds);

    }
}
