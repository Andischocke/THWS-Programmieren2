package exercise13.task1;

public class Main
{
    public static void main(String[] args)
    {
        int x = 4;
        int y = 5;
        System.out.println("Rook");
        Rook rook = new Rook(x, y);
        rook.printMoveableSquares();
        System.out.println("Bishop");
        Bishop bishop = new Bishop(x, y);
        bishop.printMoveableSquares();
        System.out.println("Queen");
        Queen queen = new Queen(x, y);
        queen.printMoveableSquares();
    }
}
