package action.memento;

public class Test
{

    public static void main(String[] args)
    {
        Originator org = new Originator();
        org.setState("meeting");
        org.showState();

        Caretaker ctk = new Caretaker();
        ctk.setMemento(org.createMemento());// state save in Caretaker

        org.setState("sleepping");
        org.showState();

        org.setMemento(ctk.getMemento());// import state
        org.showState();
    }

}
