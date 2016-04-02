package create.abstractfactory;

public class BlackAnimalFactory implements IAnimalFactory
{

    @Override
    public ICat CreateCat()
    {
        return new BlackCat();
    }

    @Override
    public IDog CreateDog()
    {
        return new BlackDog();
    }

}
