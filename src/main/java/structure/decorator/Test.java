package structure.decorator;

public class Test
{

    public static void main(String[] args)
    {
        Man man = new Man();
        ManDecoratorA md1 = new ManDecoratorA();
        ManDecoratorB md2 = new ManDecoratorB();

        man.eat();
        
        md1.setPerson(man);
        md1.eat();
        
        md2.setPerson(md1);
        md2.eat();
    }
}
