package action.responsibilitychain;

public class PMRequestHandle implements IRequestHandle
{

    IRequestHandle rh;

    public PMRequestHandle(IRequestHandle rh)
    {
        this.rh = rh;
    }

    @Override
    public void handleRequest(IRequest request)
    {
        System.out.println("PMRequestHandle start!");
        
        if (request instanceof AddMoneyRequest)
        {
            System.out.println("Request add money, PM please approve!!");
        }
        else
        {
            System.out.println("Request transfer to HR!");
            rh.handleRequest(request);
        }
        
        System.out.println("PMRequestHandle end!");
    }

}
