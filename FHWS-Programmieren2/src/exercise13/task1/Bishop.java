package exercise13.task1;

public class Bishop extends AbstractFigur implements InterfaceBishop
{
    public Bishop(int x, int y)
    {
        super(x, y);
    }

    public Board getMoveableSquares()
    {
        Board board = new Board();
        board.markSquare(x, y);

        for (int i = 1; (x - i) >= 1 && (y - i) >= 1; i++)
        {
            board.markSquare(x - i, y - i);
        }
        for (int i = 1; (x + i) <= 8 && (y - i) >= 1; i++)
        {
            board.markSquare(x + i, y - i);
        }
        for (int i = 1; (x + i) <= 8 && (y + i) <= 8; i++)
        {
            board.markSquare(x + i, y + i);
        }
        for (int i = 1; (x - i) >= 1 && (y + i) <= 8; i++)
        {
            board.markSquare(x - i, y + i);
        }
        return board;
    }
}