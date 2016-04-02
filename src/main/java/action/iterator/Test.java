package action.iterator;

public class Test
{

    public static void main(String[] arg0)
    {
        List list = new List();
        list.add("a");
        list.add("b");
        list.add("c");

        Iterator it = list.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println("=====");

        for (int i = 0; i < list.getSize(); i++)
        {
            System.out.println(list.get(i));
        }
    }

}
