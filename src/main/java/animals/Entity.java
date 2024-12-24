package animals;

public class Entity {
    protected String name;
    protected int x;
    protected int y;
    protected static int fieldWidth;
    protected static int fieldHeigth;

    public Entity() {
    }

    public Entity(String name) {
        this.name = name;
    }

    public Entity(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public static void setFieldSize(int width, int height) {
        fieldWidth = width;
        fieldHeigth = height;
    }

    public void move() {
    }

    public String toString() {
        return this.name + " " + this.x + " " + this.y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

