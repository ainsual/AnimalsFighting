package animals;

public class Turtle extends Entity{

    public Turtle() {}

    public Turtle(int x, int y) {
        super("Черепаха", x, y);
    }
    public void move() {
        int direction = (int) (Math.random() * 4);
        switch (direction) {
            case 0:
                if (this.x < fieldWidth) {
                    ++this.x;
                }
                break;
            case 1:
                if (this.y < fieldHeigth) {
                    ++this.y;
                }
                break;
            case 2:
                if (this.x > 0) {
                    --this.x;
                }
        }
    }
}
