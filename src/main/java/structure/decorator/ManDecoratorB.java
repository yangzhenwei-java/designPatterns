package structure.decorator;

public class ManDecoratorB extends Decorator
{

    public void eat()
    {
        super.eat();
        System.out.println("ManDecoratorB");
    }
}
