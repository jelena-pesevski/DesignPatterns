package behavioral.chainofresponsibility;

public class RefundHandler extends BaseHandler{

  @Override
  public void process(UserRequest userRequest) {
    if(userRequest.getRequestType().equals(RequestType.REFUND)){
      System.out.println("Working on refund request...");
    }
    checkNext(userRequest);
  }
}
