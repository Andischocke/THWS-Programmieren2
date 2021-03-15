package exercise14.task2oo;

public class Square implements InterfaceShape
{
    private double side;

    public Square(double side)
    {
        this.side = side;
    }

    @Override
    public double calculateArea()
    {
        return Math.pow(side, 2);
    }

    @Override
    public double calculatePerimeter()
    {
        return 4 * side;
    }

    public void printCalculation()
    {
        String name = this.getClass().getSimpleName();
        double area = this.calculateArea();
        double perimeter = this.calculatePerimeter();
        System.out.printf("Shape: %-20sArea: %-20.2f Perimeter: %.2f\n", name, area, perimeter);
    }
}