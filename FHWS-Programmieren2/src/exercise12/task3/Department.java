package exercise12.task3;

import java.util.ArrayList;

public class Department
{
    public String name;
    public Manager manager;
    public ArrayList<Employee> employees = new ArrayList<>();

    public Department(String name, Manager manager, ArrayList<Employee> employees)
    {
        this.name = name;
        this.manager = manager;
        this.employees = employees;
    }

    public String toString()
    {
        String string = String.format("Department:\t%s\n%s", name, manager);
        for (Employee employee : employees)
        {
            string += employee;
        }
        return string;
    }
}