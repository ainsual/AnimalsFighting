package animals;

public class Some extends Entity{

    public Some() {}

    public Some(int x, int y) {
        super("Нечто", x, y);
    }

    public void move() {
        int randX = (int) (Math.random() * (fieldWidth + 1));
        int randY = (int) (Math.random() * (fieldHeigth + 1));
        this.x = randX;
        this.y = randY;
    }
}
