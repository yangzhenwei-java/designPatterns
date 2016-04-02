package action.mediator;

public class ConcreteMediator extends Mediator
{
    private ColleagueA ca;

    private ColleagueB cb;

    public ConcreteMediator()
    {
        ca = new ColleagueA();
        cb = new ColleagueB();
    }

    public void notice(String content)
    {
        if (content.equals("boss"))
        {
            // Notice employee
            ca.action();
        }
        if (content.equals("client"))
        {
            // Notice front desk
            cb.action();
        }
    }
}
