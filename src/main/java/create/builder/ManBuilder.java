package create.builder;

public class ManBuilder implements IPersonBuilder
{

    Person person;

    public ManBuilder()
    {
        person = new Man();
    }

    @Override
    public void buildHead()
    {
        person.setHead("Build man head!");
    }

    @Override
    public void buildBody()
    {
        person.setBody("Build man body!");
    }

    @Override
    public void buildFoot()
    {
        person.setFoot("Build man foot!");

    }

    @Override
    public Person buildPerson()
    {
        return person;
    }

}
