package exercise12.task3;

import java.util.ArrayList;

public class Company
{
    protected String name;
    protected ArrayList<Department> departments = new ArrayList<>();

    public Company(String name, ArrayList<Department> departments)
    {
        this.name = name;
        this.departments = departments;
    }

    public String toString()
    {
        String string = String.format("Company:\t%s\n", name);
        for (Department d : departments)
        {
            string += d;
        }
        return string;
    }

    public static void main(String[] args)
    {
        Manager manager0 = new Manager(100, "A", "A", 2000);
        Manager manager1 = new Manager(200, "D", "D", 2000);

        ArrayList<Employee> employeeList0 = new ArrayList<>();
        employeeList0.add(new Employee(101, "B", "A", 1000));
        employeeList0.add(new Employee(102, "C", "A", 1000));

        ArrayList<Employee> employeeList1 = new ArrayList<>();
        employeeList1.add(new Employee(201, "E", "D", 1000));
        employeeList1.add(new Employee(202, "F", "D", 1000));

        ArrayList<Department> departments = new ArrayList<>();
        departments.add(new Department("Accounting", manager0, employeeList0));
        departments.add(new Department("Management", manager1, employeeList1));

        Company company = new Company("Alphabet", departments);

        System.out.println(company);
        manager0.promote(manager0);
        manager0.promote(employeeList0.get(0));
        System.out.println(company);
    }
}