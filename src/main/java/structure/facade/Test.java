package structure.facade;

public class Test
{

    public static void main(String[] args)
    {
        IServiceA sa = new ServiceA();
        IServiceB sb = new ServiceB();

        sa.methodA();
        sb.methodB();

        System.out.println("========");

        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}
