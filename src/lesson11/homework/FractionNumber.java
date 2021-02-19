package lesson11.homework;

public interface FractionNumber {
    int DEFAULT_DIVISOR_VALUE = 1;
    void setDividend(int dividend);
    int getDividend();
    void setDivisor(int divisor) throws IllegalArgumentException;
    int getDivisor();
    double value();
    String toString();
}
