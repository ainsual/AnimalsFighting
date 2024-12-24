package animals;

public class Ant extends Entity {
    public Ant() {
    }

    public Ant(int x, int y) {
        super("муравей", x, y);
    }

    public void move() {
        int direction = (int)(Math.random() * 5);
        switch (direction) {
            case 0:
                if (this.y > 0) {
                    --this.y;
                }
                break;
            case 1:
                if (this.x < fieldWidth) {
                    ++this.x;
                }
                break;
            case 2:
                if (this.y < fieldHeigth) {
                    ++this.y;
                }
                break;
            case 3:
                if (this.x > 0) {
                    --this.x;
                }
        }

    }
}

