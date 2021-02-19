package lesson11.homework;

public class OptionFractionNumber implements FractionNumber {
    private int dividend;
    private int divisor;
    private double result;

    @Override
    public void setDividend(int dividend) {
        this.dividend = dividend;
    }

    @Override
    public int getDividend() {
        return dividend;
    }

    @Override
    public void setDivisor(int divisor) throws IllegalArgumentException {
        this.divisor = divisor;
    }

    @Override
    public int getDivisor() {
        return divisor;
    }

    @Override
    public double value() {
        result = (double) dividend / (double) divisor;
        return result;
    }

    @Override
    public String toString() {
        return dividend + " / " + divisor;
    }

}