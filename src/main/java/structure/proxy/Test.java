package structure.proxy;

public class Test
{

    public static void main(String[] args)
    {
        IObject obj = new ProxyObject();
        obj.action();
    }
}
