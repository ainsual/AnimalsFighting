package structure;

public class Main {
    public static void main(String[] args) {
        // Создание экземпляра класса Student
        Student student = new Student(
                "Иванов", "Иван", "Иванович",
                20, "Группа А", 85);
        Student student1 = new Student(
                "Иванов", "Иван", "Иванович",
                20, "Группа А", 85);
        Student student2 = new Student(
                "Васильев", "Иван", "Иванович",
                20, "Группа А", 85);

        System.out.println(student.equals(student1));
        System.out.println(student1.equals(student2));
        // Создание экземпляра класса Teacher
        Teacher teacher = new Teacher("Петров", "Петр", "Петрович", 45);

        // Установка дисциплин для учителя
        teacher.setDisciplines(new String[]{"Математика", "Физика", "Информатика"});

        // Вывод информации о студенте
        System.out.println(student);

        // Вывод информации о teacher
        System.out.println(teacher);
    }
}
