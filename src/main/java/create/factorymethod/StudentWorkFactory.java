package create.factorymethod;

public class StudentWorkFactory implements IWorkFactory
{

    @Override
    public IWork getWork()
    {
        return new StudentWork();
    }

}
