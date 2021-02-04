package lesson6;

public class NumUtil {
    public static void findBiggest(int a, int b, int c) {
        int bigNum = Math.max(a, b);
        int biggerNum = Math.max(bigNum, c);
        System.out.println("Большее из чисел  " + biggerNum);
    }
}