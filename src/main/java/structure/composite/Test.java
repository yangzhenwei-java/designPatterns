package structure.composite;

import java.util.List;

public class Test
{
    public static void main(String[] args)
    {
        Employee pm = new ProjectManager("Project manager");
        Employee pa = new ProjectAssistant("Project assistant");
        Employee p1 = new Programmer("Programmer 1");
        Employee p2 = new Programmer("Programmer 2");

        pm.add(pa);
        pm.add(p1);
        pm.add(p2);

        List<Employee> ems = pm.getEmployees();
        for (Employee em : ems)
        {
            System.out.println(em.getName());
        }
    }
}
