package exercise13.task1;

public class Rook extends AbstractFigur implements InterfaceRook
{
    public Rook(int x, int y)
    {
        super(x, y);
    }

    public Board getMoveableSquares()
    {
        Board board = new Board();
        for (int i = 1; i <= 8; i++)
        {
            board.markSquare(i, y);
            board.markSquare(x, i);
        }
        return board;
    }
}