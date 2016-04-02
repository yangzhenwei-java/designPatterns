package create.builder;

public class WomanBuilder implements IPersonBuilder
{

    Person person;

    public WomanBuilder()
    {
        person = new Woman();
    }

    @Override
    public void buildHead()
    {
        person.setHead("Build woman head!");
    }

    @Override
    public void buildBody()
    {
        person.setBody("Build woman body!");
    }

    @Override
    public void buildFoot()
    {
        person.setFoot("Build woman foot!");

    }

    @Override
    public Person buildPerson()
    {
        return person;
    }

}
