package exercise14.task2procedural;

public class Calculator
{

    public double calculateArea(Object object)
    {
        double area = -1;

        if (Circle.class == object.getClass())
        {
            Circle circle = (Circle) object;
            area = Math.PI * Math.pow(circle.getRadius(), 2);
        } else if (Square.class == object.getClass())
        {
            Square square = (Square) object;
            area = Math.pow(square.getSide(), 2);
        } else if (Rectangle.class == object.getClass())
        {
            Rectangle rectangle = (Rectangle) object;
            area = rectangle.getSideX() * rectangle.getSideY();
        }
        return area;
    }

    public double calculatePerimeter(Object object)
    {
        double perimeter = -1;

        if (object.getClass() == Circle.class)
        {
            Circle circle = (Circle) object;
            perimeter = 2 * Math.PI * circle.getRadius();
        } else if (object.getClass() == Square.class)
        {
            Square square = (Square) object;
            perimeter = 4 * square.getSide();
        } else if (object.getClass() == Rectangle.class)
        {
            Rectangle rectangle = (Rectangle) object;
            perimeter = 2 * (rectangle.getSideX() + rectangle.getSideY());
        }
        return perimeter;
    }

    public void printCalculation(Object object)
    {
        String name = object.getClass().getSimpleName();
        double area = calculateArea(object);
        double perimeter = calculatePerimeter(object);
        System.out.printf("Shape: %-20sArea: %-20.2f Perimeter: %.2f\n", name, area, perimeter);
    }

    public static void main(String[] args)
    {
        System.out.println("Calculation: procedural");
        Calculator calculator = new Calculator();
        Circle circle = new Circle(5);
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(5, 5);

        calculator.printCalculation(circle);
        calculator.printCalculation(square);
        calculator.printCalculation(rectangle);
    }
}