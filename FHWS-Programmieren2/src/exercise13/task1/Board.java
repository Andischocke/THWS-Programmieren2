package exercise13.task1;

public class Board
{
    public boolean[][] board = new boolean[8][8];

    public Board()
    {
    }

    public void markSquare(int x, int y)
    {
        board[x - 1][y - 1] = true;
    }

    public boolean getSquare(int x, int y)
    {
        return board[x - 1][y - 1];
    }

    public Board combineBoards(Board board)
    {
        for (int i = 1; i <= 8; i++)
        {
            for (int j = 1; j <= 8; j++)
            {
                if (this.getSquare(i, j) || board.getSquare(i, j))
                {
                    this.markSquare(i, j);
                }
            }
        }
        return this;
    }

    public void printBoard()
    {
        for (int j = 1; j <= 8; j++)
        {
            for (int i = 1; i <= 8; i++)
            {
                if (this.getSquare(i, j))
                    System.out.print("x ");
                else
                    System.out.print("o ");
            }
            System.out.println();
        }
    }
}