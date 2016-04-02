package structure.composite;

import java.util.List;

public abstract class Employee
{

    private String name;

    private List<Employee> employees;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<Employee> getEmployees()
    {
        return employees;
    }

    public void setEmployees(List<Employee> employees)
    {
        this.employees = employees;
    }

    public abstract void add(Employee employee);

    public abstract void delete(Employee employee);

    public void printInfo()
    {
        System.out.println(name);
    }

}
