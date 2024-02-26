package lesson3.calc;

public class Calculator {
    public int div(int a, int b) throws ArithmeticException {
        if (b == 0) throw new ArithmeticException("b == zero");
        return a / b;
    }

    public double div(double a, double b) {
        if (b == 0) throw new ArithmeticException("b == zero");
        return a / b;
    }
}
