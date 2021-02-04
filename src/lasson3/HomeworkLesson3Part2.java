package lasson3;

public class HomeworkLesson3Part2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 20; i < 30; i++) {
            if (i % 2 != 0)
                sum = sum + i;
        }
            System.out.println("Сумма всех нечетных -   " + sum);

    }
}
