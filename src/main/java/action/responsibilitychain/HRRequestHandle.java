package action.responsibilitychain;

public class HRRequestHandle implements IRequestHandle
{

    @Override
    public void handleRequest(IRequest request)
    {
        System.out.println("HRRequestHandle start!");
        
        if (request instanceof DimissionRequest)
        {
            System.out.println("Request Dimission, HR please approve!");
        }

        System.out.println("HRRequestHandle end!");
    }

}
