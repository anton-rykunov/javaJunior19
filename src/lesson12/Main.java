package lesson12;

public class Main {
    public static void main(String[] args) {
        FractionNumberIImpl drob1 = new FractionNumberIImpl(1, 6);
        FractionNumberIImpl drob2 = new FractionNumberIImpl(3, 8);

        CalkulyatorDrobey calkulyator = new CalkulyatorDrobey();
        FractionNumber resultAdd = calkulyator.add(drob1, drob2);
        FractionNumber resultSub = calkulyator.sub(drob1, drob2);
        FractionNumber resultMul = calkulyator.mul(drob1, drob2);
        FractionNumber resultDiv = calkulyator.div(drob1, drob2);
        System.out.println(resultAdd);
        System.out.println(resultSub);
        System.out.println(resultMul);
        System.out.println(resultDiv);
    }
}
