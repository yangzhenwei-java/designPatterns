package create.builder;

public class PersonDirector
{

    public Person constructPerson(IPersonBuilder pb)
    {
        pb.buildHead();
        pb.buildBody();
        pb.buildFoot();

        return pb.buildPerson();
    }
}
