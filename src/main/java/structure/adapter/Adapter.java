package structure.adapter;

public class Adapter implements ITarget
{

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee)
    {
        this.adaptee = adaptee;
    }

    @Override
    public void adapteeMethod()
    {
        adaptee.adpateeMethod();
    }

    @Override
    public void adapterMethod()
    {
        System.out.println("Adapter method!");

    }

}
