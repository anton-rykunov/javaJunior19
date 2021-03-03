package lesson12;

public class CalkulyatorDrobey implements FractionNumberOperation{
    @Override
    public FractionNumber add(FractionNumber a, FractionNumber b) throws NullPointerException {
        int resultDividend = a.getDividend() * b.getDivisor() + b.getDividend() * a.getDivisor();
        int resultDivisor = a.getDivisor() * b.getDivisor();
        FractionNumberIImpl result = new FractionNumberIImpl();
        result.setDividend(resultDividend);
        result.setDivisor(resultDivisor);
        return result;
    }

    @Override
    public FractionNumber sub(FractionNumber a, FractionNumber b) throws NullPointerException {
        int resultDividend = a.getDividend() * b.getDivisor() - b.getDividend() * a.getDivisor();
        int resultDivisor = a.getDivisor() * b.getDivisor();
        FractionNumberIImpl result = new FractionNumberIImpl();
        result.setDividend(resultDividend);
        result.setDivisor(resultDivisor);
        return result;
    }

    @Override
    public FractionNumber mul(FractionNumber a, FractionNumber b) throws NullPointerException {
        int resultDividend = a.getDividend() * b.getDividend();
        int resultDivisor = a.getDivisor() * b.getDivisor();
        FractionNumberIImpl result = new FractionNumberIImpl();
        result.setDividend(resultDividend);
        result.setDivisor(resultDivisor);
        return result;
    }

    @Override
    public FractionNumber div(FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException {
        int resultDividend = a.getDividend() * b.getDivisor();
        int resultDivisor = a.getDivisor() * b.getDividend();
        FractionNumberIImpl result = new FractionNumberIImpl();
        result.setDividend(resultDividend);
        result.setDivisor(resultDivisor);
        return result;
    }

}
