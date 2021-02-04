package lesson2;

public class Main1 {
    public static void main(String[] args) {

        int a = 3;
        int b = 5;
        int c = 4;

        if (a == b && a == c && b == c)
            System.out.println("Треугольник равносторонни");
        else if (a == b || a == c || b == c)
            System.out.println("Треугольник равнобедренный");
        else
            System.out.println("Треугольник разносторонний");

    }

}
