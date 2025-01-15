package lab15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainBigText {
    public static void main(String[] args) throws FileNotFoundException {

        // патерны
        Pattern pattern1 = Pattern.compile("(Я|мне|моё)", Pattern.CASE_INSENSITIVE);
        Pattern pattern2 = Pattern.compile("(море|моря|морем|морю|морями|морях)", Pattern.CASE_INSENSITIVE);
        Pattern pattern3 = Pattern.compile("муза", Pattern.CASE_INSENSITIVE);
        Pattern pattern4 = Pattern.compile("любовь", Pattern.CASE_INSENSITIVE);
        Pattern pattern5 = Pattern.compile("ветры.*веют", Pattern.CASE_INSENSITIVE);
        Pattern pattern6 = Pattern.compile("друзья", Pattern.CASE_INSENSITIVE);
        Pattern pattern7 = Pattern.compile("поэт", Pattern.CASE_INSENSITIVE);
        Pattern pattern8 = Pattern.compile("взор.*(вс)?тревожит", Pattern.CASE_INSENSITIVE);

        // Массив для хранения номеров строк
        int[][] list = new int[8][5];

        // Массив паттернов
        Pattern[] patterns = {
                pattern1,
                pattern2,
                pattern3,
                pattern4,
                pattern5,
                pattern6,
                pattern7,
                pattern8
        };

        // Проход по каждому паттерну
        for (int i = 0; i < 8; ++i) {
            String pathToFile = "C:\\Users\\karim\\IdeaProjects\\AnimalsFighting\\src\\main\\java\\lab15\\pushkin.txt";
            Scanner scanner = new Scanner(new File(pathToFile));
            int j = 0;
            int countRows = 1;
            while (scanner.hasNextLine() && j < 5) {
                String line = scanner.nextLine();
                Matcher matcher = patterns[i].matcher(line);
                while (matcher.find()) {
                    list[i][j] = countRows;
                    j++;
                    if (j == 5) break;
                }
                countRows++;
            }
            scanner.close();
        }

        // Вывод результатов
        for (int i = 0; i < 8; ++i) {
            System.out.print((i + 1) + ". ");
            for (int j = 0; j < 5; ++j) {
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }
    }
}
