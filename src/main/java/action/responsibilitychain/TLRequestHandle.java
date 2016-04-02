package action.responsibilitychain;

public class TLRequestHandle implements IRequestHandle
{

    IRequestHandle rh;

    public TLRequestHandle(IRequestHandle rh)
    {
        this.rh = rh;
    }

    public void handleRequest(IRequest request)
    {
        System.out.println("TLRequestHandle start!");
        if (request instanceof LeaveRequest)
        {
            System.out.println("Request leave, TL please approve!");
        }
        else
        {
            System.out.println("Request transfer to PM!");
            rh.handleRequest(request);
        }
        
        System.out.println("TLRequestHandle end!");
    }
}
