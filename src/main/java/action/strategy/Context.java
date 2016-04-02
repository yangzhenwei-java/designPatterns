package action.strategy;

public class Context
{

    IStrategy stra;

    public Context(IStrategy stra)
    {
        this.stra = stra;
    }

    public void doMethod()
    {
        stra.method();
    }

}
