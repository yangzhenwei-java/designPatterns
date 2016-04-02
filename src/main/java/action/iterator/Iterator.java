package action.iterator;

public class Iterator implements IIterator
{

    private IList list;

    private int index;

    public Iterator(IList list)
    {
        index = 0;
        this.list = list;
    }

    public void first()
    {
        index = 0;
    }

    public void last()
    {
        index = list.getSize();
    }

    public Object next()
    {
        Object obj = list.get(index);
        index++;
        return obj;
    }

    public boolean hasNext()
    {
        return index < list.getSize();
    }
}