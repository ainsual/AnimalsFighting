package enam13;
import enam13.model.*;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(
                "Иван",
                "Иванов",
                "Иванов",
                Gender.Male,
                Color.White
        );

        System.out.println(person);
    }

}
