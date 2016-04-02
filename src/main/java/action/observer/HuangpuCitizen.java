package action.observer;

public class HuangpuCitizen extends Citizen
{

    public HuangpuCitizen(IPoliceman pol)
    {
        setPolicemen();
        register(pol);
    }

    public void sendMessage(String help)
    {
        setHelp(help);
        for (int i = 0; i < pols.size(); i++)
        {
            IPoliceman pol = pols.get(i);
            // Notice Police Action
            pol.action(this);
        }
    }

}
