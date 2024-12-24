package animals;

public class Game {
    private int fieldWidth;
    private int fieldHeight;
    private Entity[] players;
    private int finishFieldWight;
    private int finishFieldHeight;
    private int finishX;
    private int finishY;

    public Game() {
    }

    public Game(int fieldWidth,
                int fieldWeight,
                int finishFieldWight,
                int finishFieldHeight,
                int finishX, int finishY,
                Entity[] players) {
        this.fieldWidth = fieldWidth;
        this.fieldHeight = this.fieldHeight;
        this.finishFieldWight = finishFieldWight;
        this.finishFieldHeight = finishFieldHeight;
        this.finishX = finishX;
        this.finishY = finishY;
        this.players = players;
    }

    public Entity start() {
        while(true) {
            for(int i = 0; i < this.players.length; ++i) {
                this.players[i].move();
            }

            for(int i = 0; i < this.players.length; ++i) {
                if (this.players[i].getX() <= this.finishX + this.finishFieldWight &&
                        this.players[i].getY() >= this.finishY &&
                        this.players[i].getY() <= this.finishY + this.finishFieldHeight) {
                    System.out.println(this.players[i]);
                    return this.players[i];
                }
            }
        }
    }
}

