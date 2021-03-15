package exercise15.task1;

public class Fraction
{
    public int numerator;
    public int denominator;

    public Fraction(int numerator, int denominator) throws ArithmeticException
    {
        if (denominator != 0)
        {
            this.numerator = numerator;
            this.denominator = denominator;
        } else
        {
            throw new ArithmeticException("Denominator can not be zero");
        }
    }

    public static void main(String[] args)
    {
        try
        {
            new Fraction(1, 1);
            new Fraction(1, 0);
        } catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    }
}