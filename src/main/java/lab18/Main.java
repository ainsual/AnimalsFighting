package lab18;

public class Main {
    public static void main(String[] args) {
        //First method
        CalculateIntegral calculateIntegral =
                new CalculateIntegral(0,5, new Sinus());
        System.out.println(calculateIntegral.get1());

        //Other methods
        System.out.println(calculateIntegral.get2());
        System.out.println(calculateIntegral.get3());
        System.out.println(calculateIntegral.get4());

    }
}
