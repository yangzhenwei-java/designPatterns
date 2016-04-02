package create.factorymethod;

public class TeacherWorkFactory implements IWorkFactory
{

    @Override
    public IWork getWork()
    {
        return new TeacherWork();
    }

}
