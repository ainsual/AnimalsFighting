package lab18;

public class CalculateIntegral extends AbstractCalculateIntegral{
    private static final int N = 1000;
    public CalculateIntegral(double a, double b, Function function) {
        super(a, b, function);
    }

    public double get1() {
        double sum = 0;
        double h = (b - a)/N;
        for (int i = 0; i < N; i++) {
            sum += h * function.calculate(a + h *i);
        }
        return sum;
    }

    public double get2() {
        double sum = 0;
        double h = (b - a) / N;
        for (int i = 0; i < N; i++) {
            sum += h * function.calculate(b - h*i);
        }
        return sum;
    }

    public double get3() {
        double sum = 0;
        double h = (b - a) / N;
        for (int i = 0; i + 1< N; i++) {
            sum += h * 0.5 * (
                    function.calculate(a + h*i) +
                    function.calculate(a + h*(i+1))
            );
        }
        return sum;
    }

    public double get4() {
        double sum = 0;
        double h = (b - a) * 0.5 / N;
        for (int i = 0; i < N * 0.5; i++) {
            sum += h * function.calculate((b - a) * 0.5 - h*i);
        }
        for (int i = 0; i < N * 0.5; i++) {
            sum += h * function.calculate((b - a) * 0.5 + h*i);
        }
        return sum;
    }

}
