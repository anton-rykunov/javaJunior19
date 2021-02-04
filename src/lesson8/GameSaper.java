package lesson8;

public class GameSaper {
    public static void main(String[] args) {
    char[][] gameField = InitSaper.createField();
    String level = InitSaper.getLevel();
    InitSaper.fillMines(gameField,level);
    InitSaper.printGameField(gameField);

    }
}

