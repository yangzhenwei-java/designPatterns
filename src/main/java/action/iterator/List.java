package action.iterator;

public class List implements IList
{
    private Object[] list;

    private int index;

    private int size;

    public List()
    {
        index = 0;
        size = 0;
        list = new Object[100];
    }

    public Iterator iterator()
    {
        return new Iterator(this);
    }

    public Object get(int index)
    {
        return list[index];
    }

    public int getSize()
    {
        return this.size;
    }

    public void add(Object obj)
    {
        list[index++] = obj;
        size++;
    }
}
