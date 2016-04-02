package action.observer;

public class Test
{

    public static void main(String[] args)
    {
        IPoliceman thPol = new TianhePoliceman();
        IPoliceman hpPol = new HuangpuPoliceman();

        Citizen citizen = new HuangpuCitizen(hpPol);
        citizen.sendMessage("unnormal");
        citizen.sendMessage("normal");

        System.out.println("===========");

        citizen = new TianheCitizen(thPol);
        citizen.sendMessage("normal");
        citizen.sendMessage("unnormal");
    }

}
