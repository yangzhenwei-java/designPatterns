package structure.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory
{

    private static Map<String, IFlyweight> flyweights = new HashMap<String, IFlyweight>();

    public FlyweightFactory(String arg)
    {
        flyweights.put(arg, new Flyweight());
    }

    public static IFlyweight getFlyweight(String key)
    {
        if (flyweights.get(key) == null)
        {
            flyweights.put(key, new Flyweight());
        }
        return flyweights.get(key);
    }

    public static int getSize()
    {
        return flyweights.size();
    }
}
