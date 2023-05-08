package behavioral.chainofresponsibility;

public class PurchaseHandler extends BaseHandler{

  @Override
  public void process(UserRequest userRequest) {
    if(userRequest.getRequestType().equals(RequestType.PURCHASE)){
      System.out.println("Working on purchase request...");
    }
    checkNext(userRequest);
  }
}
