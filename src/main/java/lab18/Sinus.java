package lab18;

public class Sinus implements Function{

    public double calculate(double x) {
        double res = Math.sin(x);
        return (res > 0) ? res : res * (-1);
    }
}
