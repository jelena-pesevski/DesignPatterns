package behavioral.chainofresponsibility;

public class ReturnHandler extends BaseHandler{

  @Override
  public void process(UserRequest userRequest) {
    if(userRequest.getRequestType().equals(RequestType.RETURN)){
      System.out.println("Working on return request...");
    }
    checkNext(userRequest);
  }
}
