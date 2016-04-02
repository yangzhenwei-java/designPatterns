package structure.adapter;

public class Test
{

    public static void main(String[] args)
    {
        ITarget target = new Adapter(new Adaptee());
        target.adapteeMethod();
        target.adapterMethod();
    }

}
