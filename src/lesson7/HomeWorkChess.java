package lesson7;

public class HomeWorkChess {
    public static void main(String[] args) {
        int[][] chessBoard = new int[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                if (i % 2 == 0 && j % 2 == 0 || i % 2 != 0 && j % 2 != 0)
                    System.out.print(chessBoard[i][j] + "  ");
                else
                    System.out.print("1" + "  ");
            }
            System.out.println();
        }
    }
}