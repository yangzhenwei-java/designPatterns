package structure.proxy;

public class Object implements IObject
{

    @Override
    public void action()
    {
        System.out.println("========");
        System.out.println("========");
        System.out.println("This class proxy by other class!");
        System.out.println("========");
        System.out.println("========");
    }

    
}
