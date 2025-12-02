package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n0 - Exit");
        System.out.print("Your choice: ");
        String x = scanner.next();
        if (x.equals("1")) {
            Cli.greeting();
        } else if (x.equals("2")) {
            Even.evenGame();
        } else if (x.equals("3")) {
            Calc.calcGame();
        }
    }
}
