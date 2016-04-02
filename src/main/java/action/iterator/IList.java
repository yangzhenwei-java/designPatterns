package action.iterator;

public interface IList
{
    IIterator iterator();

    Object get(int index);

    int getSize();

    void add(Object obj);
}
