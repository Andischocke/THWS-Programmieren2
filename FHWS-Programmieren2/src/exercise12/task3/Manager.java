package exercise12.task3;

public class Manager extends Employee
{
    public Manager(int idNumber, String prename, String surname, double wageBase)
    {
        super(idNumber, prename, surname, wageBase);
        this.wageFactor = 2;
    }

    public void promote(Employee employee)
    {
        employee.setWageFactor(employee.getWageFactor() * 1.10);
    }
}