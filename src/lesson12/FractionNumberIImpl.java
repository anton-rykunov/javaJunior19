package lesson12;

import java.util.Objects;

public class FractionNumberIImpl implements FractionNumber {
    private int dividend;
    private int divisor;

    public FractionNumberIImpl(int dividend, int divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }

    public FractionNumberIImpl() {

    }

    @Override
    public void setDividend(int dividend) {
        this.dividend = dividend;
    }

    @Override
    public int getDividend() {
        return this.dividend;
    }

    @Override
    public void setDivisor(int divisor) throws IllegalArgumentException {
        this.divisor = divisor;
    }

    @Override
    public int getDivisor() {
        return this.divisor;
    }

    @Override
    public double value() {
        return (double) this.dividend / divisor;
    }

    @Override
    public String toString() {
        return  this.dividend + "/" + this.divisor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FractionNumberIImpl that = (FractionNumberIImpl) o;
        return dividend == that.dividend && divisor == that.divisor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dividend, divisor);
    }
}
