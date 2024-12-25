package enam13.model;

public class Person {

    private String firstName;
    private String middleName;
    private String lastName;
    private Gender gender;
    private Color color;

    public Person(String firstName, String middleName, String lastName, Gender gender, Color color) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.color = color;
    }

    public String toString() {
        return firstName + " " + middleName + ' ' +
                lastName + ' ' + gender + ' ' + color.rusName;
    }
}
