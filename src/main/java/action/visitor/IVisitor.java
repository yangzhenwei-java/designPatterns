package action.visitor;

import java.util.Collection;

public interface IVisitor
{

    public void visitString(StringElement stringE);

    public void visitFloat(FloatElement floatE);

    public void visitCollection(Collection collection);

}