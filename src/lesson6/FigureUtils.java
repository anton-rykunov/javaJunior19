package lesson6;

public class FigureUtils {
    public static double squareOfTriangle(int a, int b, int c) {
        int p = (a + b + c) / 2;
        double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return square;
    }
}

