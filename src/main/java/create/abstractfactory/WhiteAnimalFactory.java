package create.abstractfactory;

public class WhiteAnimalFactory implements IAnimalFactory
{

    @Override
    public ICat CreateCat()
    {
        return new WhiteCat();
    }

    @Override
    public IDog CreateDog()
    {
        return new WhiteDog();
    }

}
