package action.observer;

public class HuangpuPoliceman implements IPoliceman
{

    public void action(Citizen ci)
    {
        String help = ci.getHelp();
        
        if (help.equals("normal"))
        {
            System.out.println("normal, don't need action!");
        }
        
        if (help.equals("unnormal"))
        {
            System.out.println("unnormal, huangpu policeman action!");
        }
    }

}
