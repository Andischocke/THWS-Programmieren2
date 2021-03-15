package exercise15.task1;

public class Point
{
    public int x;
    public int y;

    public void shiftPoint(int targetX, int targetY) throws PointNotOnDisplayException
    {
        if (targetX < 0 || targetY < 0 || targetX > 1920 || targetY > 1080)
        {
            throw new PointNotOnDisplayException("Point not on Display");
        } else
        {
            this.x = targetX;
            this.y = targetY;
            System.out.println("Point got shifted.");
        }
    }

    public static void main(String[] args)
    {
        try
        {
            new Point().shiftPoint(100, 100);
            new Point().shiftPoint(-100, -100);
        } catch (PointNotOnDisplayException e)
        {
            System.out.println(e.getMessage());
        }
    }
}