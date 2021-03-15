package exercise14.task2oo;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Calculation: oo");
        Circle circle = new Circle(5);
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(5, 5);

        circle.printCalculation();
        square.printCalculation();
        rectangle.printCalculation();
    }
}
