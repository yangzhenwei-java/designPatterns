package action.mediator;

public class Test
{

    public static void main(String[] args)
    {
        Mediator med = new ConcreteMediator();

        med.notice("boss");
        
        med.notice("client");
    }

}
