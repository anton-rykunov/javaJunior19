package lesson11;

public class GoodBoy extends Student {
    @Override
    public int perimetrTreugolnika(int firstSide, int secondSide, int therdSide) {
        if (firstSide + secondSide < therdSide) {
            System.out.println("Это не треугольник");
            return -1;
        }
        return firstSide + secondSide + therdSide;
    }
}
