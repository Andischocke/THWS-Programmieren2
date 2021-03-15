package exercise14.task2oo;

public class Circle implements InterfaceShape
{

    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double calculateArea()
    {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter()
    {
        return 2 * Math.PI * radius;
    }

    public void printCalculation()
    {
        String name = this.getClass().getSimpleName();
        double area = this.calculateArea();
        double perimeter = this.calculatePerimeter();
        System.out.printf("Shape: %-20sArea: %-20.2f Perimeter: %.2f\n", name, area, perimeter);
    }
}