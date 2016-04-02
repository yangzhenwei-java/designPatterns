package structure.composite;

import java.util.ArrayList;

public class ProjectManager extends Employee
{

    public ProjectManager(String name)
    {
        setName(name);
        setEmployees(new ArrayList<Employee>());
    }

    @Override
    public void add(Employee employee)
    {
        this.getEmployees().add(employee);
    }

    @Override
    public void delete(Employee employee)
    {
        this.getEmployees().remove(employee);
    }
}
