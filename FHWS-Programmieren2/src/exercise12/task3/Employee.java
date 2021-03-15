package exercise12.task3;

public class Employee
{
    protected int idNumber;
    protected String prename;
    protected String surname;
    protected double wageBase;
    protected double wageFactor;

    public Employee(int idNumber, String prename, String surname, double wageBase)
    {
        this.idNumber = idNumber;
        this.prename = prename;
        this.surname = surname;
        this.wageBase = wageBase;
        this.wageFactor = 1;
    }

    public double getWage()
    {
        return wageBase * wageFactor;
    }

    public double getWageFactor()
    {
        return this.wageFactor;
    }

    public void setWageFactor(double wageFactor)
    {
        this.wageFactor = wageFactor;
    }

    public String toString()
    {
        return String.format("\t\t%d\t%s %s %.2f €\n", idNumber, prename, surname, getWage());
    }
}