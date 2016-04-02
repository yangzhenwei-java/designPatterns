package structure.decorator;

public abstract class Decorator implements IPerson
{
    protected IPerson person;

    public void setPerson(IPerson person)
    {
        this.person = person;
    }

    public void eat()
    {
        person.eat();
    }
}
