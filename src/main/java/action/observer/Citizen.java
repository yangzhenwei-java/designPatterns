package action.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Citizen
{

    List<IPoliceman> pols;

    String help = "normal";

    public void setHelp(String help)
    {
        this.help = help;
    }

    public String getHelp()
    {
        return this.help;
    }

    abstract void sendMessage(String help);

    public void setPolicemen()
    {
        this.pols = new ArrayList<IPoliceman>();
    }

    public void register(IPoliceman pol)
    {
        this.pols.add(pol);
    }

    public void unRegister(IPoliceman pol)
    {
        this.pols.remove(pol);
    }

}
