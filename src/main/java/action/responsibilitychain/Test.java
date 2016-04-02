package action.responsibilitychain;

public class Test
{

    public static void main(String[] args)
    {
        IRequestHandle hr = new HRRequestHandle();
        IRequestHandle pm = new PMRequestHandle(hr);
        IRequestHandle tl = new TLRequestHandle(pm);

        IRequest request = new DimissionRequest();
        tl.handleRequest(request);

        System.out.println("===========");

        request = new AddMoneyRequest();
        tl.handleRequest(request);

        System.out.println("========");

        request = new LeaveRequest();
        tl.handleRequest(request);
    }

}
