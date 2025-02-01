package homeFunc;

public class MainNew {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("James", "Smith", 1, 55),
                new Student("Olivia", "Johnson", 2, 78),
                new Student("Liam", "Williams", 3, 92),
                new Student("Emma", "Brown", 4, 100),
                new Student("Noah", "Jones", 5, 48),
                new Student("Ava", "Garcia", 6, 10),
                new Student("Elijah", "Martinez", 7, 67)
        };
        MethodSort method = new MethodSort() {
            @Override
            public int compare(Object obj1, Object obj2) {
                int res = ((Student) obj1).getPoints() -
                        ((Student) obj2).getPoints();
                return res;
            }
        };
        SortArray.sort(students, method);

        for (Student s: students){
            System.out.println(s);
        }

    }
}
