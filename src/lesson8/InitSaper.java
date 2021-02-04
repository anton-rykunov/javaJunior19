package lesson8;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class InitSaper {
    public static char[][] createField() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк в игре");
        int rows = scanner.nextInt();
        System.out.println("Введите количество колонок в игре");
        int cols = scanner.nextInt();
        char[][] gameField = new char[rows][cols];
        return gameField;
    }

    public static String getLevel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите уровень сложности");
        System.out.println("Введите: \"слабый\"   \"средний\"   \"сложный\"");
        String level = scanner.next();
        return level;
    }

    public static void printGameField(char field[][]) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + "    ");
            }
            System.out.println();
        }
    }

    public static char[][] fillMines(char[][] field, String level) {
        int mines = 0;
        if (level.equalsIgnoreCase("слабый")) {
            mines = (field.length * field[0].length) / 10;
        } else if (level.equalsIgnoreCase("средний")) {
            mines = (field.length * field[0].length) / 5;
        } else {
            mines = (field.length * field[0].length / 10) * 3;
        }
        for (int i = 0; i < mines; i++) {
            addMine(field);

        }
        return field;
    }

    private static void addMine(char[][] field) {
        int randomRows = ThreadLocalRandom.current().nextInt(0, field.length);
        int randomCols = ThreadLocalRandom.current().nextInt(0, field[0].length);
        if (field[randomCols][randomCols] != '*') {
            field[randomRows][randomCols] = '*';
        } else {
            addMine(field);
        }
    }
}
