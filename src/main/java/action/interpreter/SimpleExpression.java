package action.interpreter;

public class SimpleExpression extends Expression
{

    void interpret(Context ctx)
    {
        System.out.println("This is simple expression!");
    }
}