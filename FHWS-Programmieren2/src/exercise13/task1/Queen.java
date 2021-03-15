package exercise13.task1;

public class Queen extends AbstractFigur implements InterfaceBishop, InterfaceRook
{
    InterfaceBishop bishop;
    InterfaceRook rook;

    public Queen(int x, int y)
    {
        super(x, y);
        bishop = new Bishop(x, y);
        rook = new Rook(x, y);
    }

    @Override
    public Board getMoveableSquares()
    {
        Board boardBishop = bishop.getMoveableSquares();
        Board boardRook = rook.getMoveableSquares();
        Board boardQueen = boardRook.combineBoards(boardBishop);
        return boardQueen;
    }
}