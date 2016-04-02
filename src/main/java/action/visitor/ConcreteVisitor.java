package action.visitor;

import java.util.Collection;
import java.util.Iterator;

public class ConcreteVisitor implements IVisitor
{

    public void visitCollection(Collection collection)
    {
        Iterator iterator = collection.iterator();
        while (iterator.hasNext())
        {
            Object o = iterator.next();
            if (o instanceof IVisitable)
            {
                ((IVisitable) o).accept(this);
            }
        }
    }

    public void visitFloat(FloatElement floatE)
    {
        System.out.println(floatE.getFe());
    }

    public void visitString(StringElement stringE)
    {
        System.out.println(stringE.getSe());
    }
}