package lesson10.Homework;

public class Circle {
    private int r;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public Circle() {

    }

    public Circle(int r) {
        this.r = r;
    }

    public double square() {
        return 3.14 * (double) r * (double) r;
    }

    public double length() {
        return 3.14 * (double) r * 2;
    }
}
