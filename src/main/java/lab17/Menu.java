package lab17;

public class Menu {
    public Role role;

    public void printMenu() {
        System.out.println("1. File");
        if (role == Role.ADMIN) {
            System.out.println("2. Create new user");
        } else {
            System.out.println("2. Get play list");
        }
        System.out.println("3. exit");
    }
}
