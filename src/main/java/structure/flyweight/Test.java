package structure.flyweight;

public class Test
{

    public static void main(String[] args)
    {

        IFlyweight fly1 = FlyweightFactory.getFlyweight("a");
        fly1.action(1);

        IFlyweight fly2 = FlyweightFactory.getFlyweight("a");
        System.out.println(fly1 == fly2);

        IFlyweight fly3 = FlyweightFactory.getFlyweight("b");
        fly3.action(2);

        IFlyweight fly4 = FlyweightFactory.getFlyweight("c");
        fly4.action(3);

        IFlyweight fly5 = FlyweightFactory.getFlyweight("d");
        fly5.action(4);

        System.out.println(FlyweightFactory.getSize());
    }

}
