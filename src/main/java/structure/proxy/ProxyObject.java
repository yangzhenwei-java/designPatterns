package structure.proxy;

import java.lang.*;

public class ProxyObject implements IObject
{

    Object obj;

    public ProxyObject()
    {
        System.out.println("This is proxy class!");
        obj = new structure.proxy.Object();
    }

    public void action()
    {
        System.out.println("Proxy start!");
        obj.action();
        System.out.println("Proxy end!");
    }

}
