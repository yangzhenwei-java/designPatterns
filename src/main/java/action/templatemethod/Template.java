package action.templatemethod;

public abstract class Template
{

    public abstract void print();

    public void update()
    {
        System.out.println("Start print");
        for (int i = 0; i < 10; i++)
        {
            print();
        }
    }

}
