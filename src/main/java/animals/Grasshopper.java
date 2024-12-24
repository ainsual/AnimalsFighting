package animals;

public class Grasshopper extends Entity{

    public Grasshopper() {}

    public Grasshopper(int x, int y) {
        super("Кузнечик", x ,y);
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
                if (this.y + 1< fieldHeigth) {
                    this.y += 2;
                }
                break;
            case 2:
                if (this.x > 0) {
                    --this.x;
                }
        }
    }
}
