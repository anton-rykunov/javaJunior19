package lesson11.homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OptionFractionNumber first = new OptionFractionNumber();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введиет значение делитмого: ");
        int dividend = scanner.nextInt();
        first.setDividend(dividend);
        System.out.println("Введите значение делителя: ");
        Scanner scanner1 = new Scanner(System.in);
        int divisor = scanner1.nextInt();
        first.setDivisor(divisor);
        System.out.println();
        System.out.println("Делимиое равно  -  " + first.getDividend());
        System.out.println("Делитель равен  -  " + first.getDivisor());
        System.out.println("Дробь выглядит так -  " + first);
        System.out.println("Результатом деления является -  " + first.value());
    }
}
