package homeFunc;

public class Student {
    private String name;
    private String surname;
    private int points;
    private int course;

    public Student(){}

    public Student(String name, String surname, int course, int points){
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString(){
        return "Student ; " + name + " " + surname + " ; " + course + " course ; " + points;
    }
}
