package create.abstractfactory;

public class Test
{

    public static void main(String[] args)
    {
        IAnimalFactory blackAnimalFactory = new BlackAnimalFactory();
        ICat blackCat = blackAnimalFactory.CreateCat();
        blackCat.eat();
        IDog blackDog = blackAnimalFactory.CreateDog();
        blackDog.eat();

        IAnimalFactory whiteAnimalFactory = new WhiteAnimalFactory();
        ICat whiteCat = whiteAnimalFactory.CreateCat();
        whiteCat.eat();
        IDog whiteDog = whiteAnimalFactory.CreateDog();
        whiteDog.eat();
    }

}
