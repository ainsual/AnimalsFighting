package animals;

public class Main {
    public static void main(String[] args) {
        int fieldWidth = 1000;
        int fieldHeigth = 1000;
        int finishFieldWight = 10;
        int finishFieldHeight = 10;
        int finishX = 495;
        int finishY = 495;
        Entity[] entities = {
            new Ant( (int) (Math.random() * (fieldWidth + 1)),
                    (int) (Math.random() * (fieldWidth + 1)) ),
            new Turtle( (int) (Math.random() * (fieldWidth + 1)),
                    (int) (Math.random() * (fieldWidth + 1))),
            new Grasshopper( (int) (Math.random() * (fieldWidth + 1)),
                    (int) (Math.random() * (fieldWidth + 1))),
            new Some( (int) (Math.random() * (fieldWidth + 1)),
                    (int) (Math.random() * (fieldWidth + 1)))
        };
        Entity.setFieldSize(fieldWidth, fieldHeigth);

        Game game = new Game(fieldWidth, fieldHeigth,
                finishFieldWight, finishFieldHeight,
                finishX, finishY, entities);
        Entity champion = game.start();
        //System.out.println(champion);
    }
}
