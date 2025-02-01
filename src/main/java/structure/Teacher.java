package structure;

public class Teacher extends Person {
    private String[] disciplines;

    public Teacher(String lastName, String firstName, String middleName, int age) {
        super(lastName, firstName, middleName, age);
    }


    public String[] getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(String[] disciplines) {
        this.disciplines = disciplines;
    }

    public String toString() {
        return "Prof " + lastName + " " + firstName + " " + middleName + ", " + age;
    }

}
