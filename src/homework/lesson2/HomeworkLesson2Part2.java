package homework.lesson2;

public class HomeworkLesson2Part2 {
    public static void main(String[] args) {
        int firstSide = 7;
        int secondSide = 7;
        int thirdSide = 7;
        int fourthSide = 7;

        if (firstSide == secondSide && firstSide == thirdSide && firstSide == fourthSide)
            System.out.println("Фигура - квадрат");
        else if (firstSide == thirdSide && secondSide == fourthSide)
            System.out.println("Фигура - прямоугольник");
        else if((firstSide == thirdSide && secondSide != fourthSide) || (firstSide != thirdSide && secondSide == fourthSide))
            System.out.println("Фигура не существует");
        else
            System.out.println("Фигура - разносторонний четырехугольник");
    }
}
