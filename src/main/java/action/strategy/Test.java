package action.strategy;

public class Test
{

    public static void main(String[] args)
    {
        Context ctx = new Context(new StrategyA());
        ctx.doMethod();

        ctx = new Context(new StrategyB());
        ctx.doMethod();

        ctx = new Context(new StrategyC());
        ctx.doMethod();
    }

}
