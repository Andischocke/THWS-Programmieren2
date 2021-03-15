package exercise14.task2oo;

public class Rectangle implements InterfaceShape
{
    private double sideX;
    private double sideY;

    public Rectangle(double sideX, double sideY)
    {
        this.sideX = sideX;
        this.sideY = sideY;
    }

    @Override
    public double calculateArea()
    {
        return sideX * sideY;
    }

    @Override
    public double calculatePerimeter()
    {
        return 2 * (sideX + sideY);
    }

    public void printCalculation()
    {
        String name = this.getClass().getSimpleName();
        double area = this.calculateArea();
        double perimeter = this.calculatePerimeter();
        System.out.printf("Shape: %-20sArea: %-20.2f Perimeter: %.2f\n", name, area, perimeter);
    }
}