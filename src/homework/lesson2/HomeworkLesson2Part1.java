package homework.lesson2;

public class HomeworkLesson2Part1 {
    public static void main(String[] args) {

        int firstNumber = 5;
        int secondNumber = 22;
        int thirdNumber = 10;
        int fourthNumber = 11;

        int largerNumber;

        if (firstNumber > secondNumber)
            largerNumber = firstNumber;
        else
            largerNumber = secondNumber;
        if (largerNumber > thirdNumber)
            largerNumber += 0;
        else
            largerNumber = thirdNumber;
        if (largerNumber > fourthNumber)
            largerNumber += 0;
        else
            largerNumber = fourthNumber;

        System.out.println("Большее из чисел - " + largerNumber);

    }

}
