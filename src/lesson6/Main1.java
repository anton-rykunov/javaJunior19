
package lesson6;

public class Main1 {
    public static void main(String[] args) {
        StringUtils.printRevers("Я люблю есть ночтю");
        String text = "Я люблю есть роллы";
        StringUtils.printRevers(text);
// Вторря задачка
        double result = FigureUtils.squareOfTriangle(4, 3, 5);
        System.out.println(result);
// Третья задачка
        StringUtils.printPartsOfText("I am programmer");
    }
}


