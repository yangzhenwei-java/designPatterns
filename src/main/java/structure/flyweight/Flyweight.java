package structure.flyweight;

public class Flyweight implements IFlyweight
{

    @Override
    public void action(int arg)
    {
        System.out.println("arg=" + arg);
    }

}
